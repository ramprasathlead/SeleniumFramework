package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	static Logger logger= LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.info("I am informer");
		logger.warn("I am warner");
		logger.error("I am error");
		logger.fatal("I am fatal");
		
		

	}

}
