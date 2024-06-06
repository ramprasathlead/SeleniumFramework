package test;

import org.testng.annotations.Test;

public class TestNGGrouping {
	
	@Test(groups={"sanity"})
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test(groups={"smoke","regression"})
public void test2() {
		
		System.out.println("Test2");
	}

	@Test(groups={"sanity","smoke"})
public void test3() {
	
	System.out.println("Test3");
}

	@Test
public void test4() {
	
	System.out.println("Test1");
}

}
