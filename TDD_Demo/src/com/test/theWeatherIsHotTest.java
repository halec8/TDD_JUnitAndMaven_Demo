package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.model.TheWeatherIsHot;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 1, 2021
 */
public class theWeatherIsHotTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTheWeatherIsHot() {
		TheWeatherIsHot weather = new TheWeatherIsHot();
		weather.getWeather(85);
		assertTrue(weather.theWeatherIsHot());
		
	}

	@Test
	public void testTheWeatherIsNotHot() {
		TheWeatherIsHot weather = new TheWeatherIsHot();
		weather.getWeather(55);
		assertFalse(weather.theWeatherIsHot());
		
	}
}
