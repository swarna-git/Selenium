package tests;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.BaseClass;

public class listeners implements ITestListener{

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	BaseClass b=new BaseClass();

public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
			}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
			}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		try {
			b.getScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
			}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
			}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
			}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
			}

	

	
	
}
