package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		assertTrue("contextLoads", true);
	}

	@Test
	public void applicationContextTest() {
		DemoApplication.main(new String[] {});
		assertTrue("applicationContextTest", true);
	}

}
