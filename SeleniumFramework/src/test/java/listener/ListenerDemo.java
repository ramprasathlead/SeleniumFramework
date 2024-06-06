package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.TestNGListener.class)
public class ListenerDemo {

	
	@Test
	public void test1() {
		
		System.out.println("I am from Test1");
	}
	
	@Test
public void test2() {
		
		Assert.assertTrue(false);
	}

	@Test
public void test3() {
		
		throw new SkipException("I am skipping this test");
	
	}
	
}
