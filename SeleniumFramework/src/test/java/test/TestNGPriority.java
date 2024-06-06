package test;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority=2)
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test
public void test2() {
		
		System.out.println("Test2");
	}

	@Test(priority=0)
public void test3() {
	
	System.out.println("Test3");
}

	@Test(priority=-1)
public void test4() {
	
	System.out.println("Test1");
}
}
