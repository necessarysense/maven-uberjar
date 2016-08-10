package com.necessarysense.maven.uberjar;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageDisplay {
	private static Logger LOG = LoggerFactory.getLogger(MessageDisplay.class);
	
	public static void main(String[] args) {
		LOG.info("Starting program run");
		
		MessageHolder messageHolder = new MessageHolder();
		if (!StringUtils.isBlank(messageHolder.getMessage())) {
			System.out.println(messageHolder.getMessage());
		}
		
		LOG.info("Program has completed.");
	}
}
