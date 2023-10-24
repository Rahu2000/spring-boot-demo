package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true, "contextLoads");
	}

	@Test
	void applicationContextTest() {
		DemoApplication.main(new String[] {});
		assertTrue(true, "applicationContextTest");
	}

}
