package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
public class TDD_Demo_TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result = JUnitCore.runClasses(changeTest.class, dollarTest.class, theWeatherIsHotTest.class,
				theWeatherIsColdTest.class, theWeatherIsWarmTest.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	
	}

}
