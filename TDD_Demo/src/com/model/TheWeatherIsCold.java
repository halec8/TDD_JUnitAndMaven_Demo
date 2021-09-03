package com.model;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 3, 2021
 */
public class TheWeatherIsCold {
	
	public boolean isTheWeatherCold = false;
	public int weather;
	public int ifLessThanThisThenTheWeatherIsCold = 60;
	
	
	public int getWeather(int i) {
		
		this.weather = i;
		return weather;
	}
	
	public boolean isTheWeatherColdOrNot() {
		
		if (weather <= ifLessThanThisThenTheWeatherIsCold) {
			
			isTheWeatherCold = true;
			
		}
		
		return isTheWeatherCold;
	}

}
