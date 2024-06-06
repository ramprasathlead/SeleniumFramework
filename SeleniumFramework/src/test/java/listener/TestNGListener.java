package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("********* Test Started"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("********* Test Successful"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("********* Test Failed"+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("********* Test skipped"+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("********* Test finished"+ context.getName());
	}

}
