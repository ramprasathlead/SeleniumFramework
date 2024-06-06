package test;

import org.testng.annotations.Test;

public class testNGDependency {
	@Test(dependsOnMethods="test3")
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test
public void test2() {
		
		System.out.println("Test2");
	}

	@Test(priority=1)
public void test3() {
	
	System.out.println("Test3");
}

	@Test(groups= {"sanity"})
public void test4() {
	
	System.out.println("Test4");
}
}
