package com.scb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capco.scblife.util.logging.ApplicationLogs;
import com.capco.scblife.util.logging.AuditLogs;
import com.capco.scblife.util.logging.SCBLogger;
import com.capco.scblife.util.logging.TransactionLogs;




@RestController
public class test {
	@Autowired
	testInterface interface1;
	
	//static final Logger logger= Logger.getLogger(test.class);
	static SCBLogger logger=new TransactionLogs(test.class);
	static SCBLogger application=new ApplicationLogs(test.class, "Otp");
	static SCBLogger application2=new ApplicationLogs(test.class, "Login");
	static SCBLogger application3=new ApplicationLogs(test.class, "PhoneNumber");
	static SCBLogger application4=new ApplicationLogs(test.class, "SecurityQuestions");
	static SCBLogger application5=new ApplicationLogs(test.class, "Payment");
	static SCBLogger application6=new ApplicationLogs(test.class, "Documents");
	static SCBLogger application7=new ApplicationLogs(test.class, "MyAccount");
	static SCBLogger application8=new ApplicationLogs(test.class, "PolicyDashboard");
	static SCBLogger application9=new ApplicationLogs(test.class, "PushNotification");
	static SCBLogger application10=new ApplicationLogs(test.class, "GetFNA");
	static SCBLogger application11=new ApplicationLogs(test.class, "GetFit");
	static SCBLogger application12=new ApplicationLogs(test.class, "ActivityLog");
	static SCBLogger application13=new ApplicationLogs(test.class, "CMS");
	static SCBLogger application14=new ApplicationLogs(test.class, "CustomerRegistration");
	static SCBLogger audit=new AuditLogs(test.class);
	
	@GetMapping
	@RequestMapping(value="/test")
	public String demo() {
		return "testesd";
	}
	
	@GetMapping
	@RequestMapping("/test3/{name}")
	public String test2(@PathVariable("name") String name) {
		logger.infoLog("info "+name);
		application.infoLog("application "+name);
		application2.infoLog("application "+name);
		application3.infoLog("application "+name);
		application4.infoLog("application "+name);
		application5.infoLog("application "+name);
		application6.infoLog("application "+name);
		application7.infoLog("application "+name);
		application8.infoLog("application "+name);
		application9.infoLog("application "+name);
		application10.infoLog("application "+name);
		application11.infoLog("application "+name);
		application12.infoLog("application "+name);
		application13.infoLog("application "+name);
		application14.infoLog("application "+name);
		audit.infoLog("audit "+name);
		audit.debugLog("debug");
		audit.warnLog("warn");
		audit.errorLog("error");
		Exception e=new Exception("testException");
		audit.warnLog("warn log", e);
		
		interface1.log();
		interface1.log();
		interface1.log();
		interface1.log();
		interface1.log();
		//logger.info("spring test: "+name);
		return "logged";
	}

}
