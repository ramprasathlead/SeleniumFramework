package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer  implements IRetryAnalyzer{

	private int retryCount=0;
	private int maxRetryCount=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(retryCount<maxRetryCount) {
			
			retryCount++;
			return true;
		}
		else
		
		return false;
	}

}
