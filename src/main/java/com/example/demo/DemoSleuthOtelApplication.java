package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoSleuthOtelApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSleuthOtelApplication.class, args);
	}

	@RestController
	class DemoSleuthOtel {
		private static final Logger log = LoggerFactory.getLogger(DemoSleuthOtelApplication.class);

		@RequestMapping("/test")
		public String service4MethodInController() throws InterruptedException {
			// MDC.put("first", "Dorothy"); -> Works
			log.debug("test endpoint called");
			return "Ok";
		}
	}

}
