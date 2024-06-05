package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionHandlingDemo {
	static Logger logger= LogManager.getLogger(ExceptionHandlingDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		demo();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}
	
	finally {
		logger.info("I have handled exception");
		System.out.println("I have handled exception");
	}

	}

	
	public static void demo ()throws Exception {
		logger.info("I am started execution");
		System.out.println("Started Execution");
		int i= 1/0;
		System.out.println("completed");
	}
}
