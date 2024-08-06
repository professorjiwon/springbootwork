package com.study.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class LoggingRunner implements ApplicationRunner {
	/*private static final*/ Logger LOGGER = LoggerFactory.getLogger(LoggingRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOGGER.trace("Trace 레벨 로그");
		LOGGER.debug("Debug 레벨 로그");
		LOGGER.info("Info 레벨 로그");
		LOGGER.warn("Warn 레벨 로그");
		LOGGER.error("Error 레벨 로그");
	}

}
