package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@Test
	void contextLoads() {
		logger.info("this is test class");
		Assertions.assertEquals(true,true);
	}

}
