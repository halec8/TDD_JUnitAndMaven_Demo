package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 2, 2021
 */
@RunWith(Suite.class)
@SuiteClasses({ changeTest.class, dollarTest.class, theWeatherIsHotTest.class })
public class AllTests {

}
