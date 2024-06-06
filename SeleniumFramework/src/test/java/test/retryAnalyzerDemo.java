package test;

import org.junit.Assert;
import org.testng.annotations.Test;

public class retryAnalyzerDemo {

	
	@Test
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test
public void test2() {
		
		System.out.println("Test2");
	}

	@Test(retryAnalyzer=listener.RetryAnalyzer.class )
public void test3() {
	
	System.out.println("Test3");
	Assert.assertTrue(false);
}
}
