package com.example.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ControllerIntegrationTest {

	@Value("${local.server.port}")
	private int port;

	private URL base;

	private final String dummyName = "foo";

	@Autowired
	private TestRestTemplate template;

	@BeforeEach
	void setUp() throws Exception {
		this.base = new URL("http://localhost:" + port + "?name=" + dummyName);
	}

	@Test
	void getHello() throws Exception {
		final ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
		assertThat(response.getBody(), equalTo("Hi " + dummyName + "!!"));
	}
}
