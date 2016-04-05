package org.testpackage;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		Result result = junit.run(junittest.JunitTests.class);
		int count =1;
		for(Object test : result.getFailures()){
			System.out.println("Failure trace : "+count +" is "+test.toString());
		}
		System.out.println("Failure Count is : "+result.getFailureCount());
		System.out.println("Total count is : "+result.getRunCount());
	}

}
