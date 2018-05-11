package com.scb;

import org.springframework.stereotype.Service;

import com.capco.scblife.util.logging.SCBLogger;
import com.capco.scblife.util.logging.TransactionLogs;

@Service
public class test2 implements testInterface{
	static SCBLogger logger=new TransactionLogs(test2.class);
	@Override
	public void log() {
		logger.infoLog("inside test 2 service");
		
	}

}
