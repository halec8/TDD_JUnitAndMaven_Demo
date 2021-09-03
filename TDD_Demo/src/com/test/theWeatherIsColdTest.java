package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.model.TheWeatherIsCold;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 3, 2021
 */
public class theWeatherIsColdTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void isTheWeatherColdtest() {
		TheWeatherIsCold weather = new TheWeatherIsCold();
		weather.getWeather(60);
		assertTrue(weather.isTheWeatherColdOrNot());
	}
	
	@Test
	public void isTheWeatherNotColdTest() {
		
		TheWeatherIsCold weather = new TheWeatherIsCold();
		weather.getWeather(75);
		assertFalse(weather.isTheWeatherCold);
	}

}
