package com.model;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 1, 2021
 */
public class TheWeatherIsHot {
	
	boolean theWeatherIsHot = false;
	int theWeatherIsHotIfHigherThan = 80;
	int weather;

	public int getWeather(int i) {
		
		this.weather = i;
		return weather;
	}

	
	public boolean theWeatherIsHot() {
		
		if (weather >= theWeatherIsHotIfHigherThan) {
			
			theWeatherIsHot = true;
		}
		
		return theWeatherIsHot;

	}
}
