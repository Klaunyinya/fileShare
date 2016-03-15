package com.kklaudia.fileshare.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLogger {

	private final Logger log = LoggerFactory.getLogger(CustomLogger.class);
	
	public void writeLog(String msg /*class, log mode*/) {
		log.debug(msg);
	}
}
