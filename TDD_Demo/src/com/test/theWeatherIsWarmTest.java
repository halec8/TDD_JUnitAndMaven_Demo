package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.model.TheWeatherIsWarm;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 3, 2021
 */
public class theWeatherIsWarmTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void theWeatherIsWarmtest() {
		
		TheWeatherIsWarm weather = new TheWeatherIsWarm();
		weather.getWeather(75);
		assertTrue(weather.isTheWeatherWarm());
	}
	
	@Test
	public void theWeahterIsNotWarmTest() {
		
		TheWeatherIsWarm weather = new TheWeatherIsWarm();
		weather.getWeather(55);
		assertFalse(weather.isTheWeatherWarm());
		
		weather.getWeather(85);
		assertFalse(weather.isTheWeatherWarm());
	}

}
