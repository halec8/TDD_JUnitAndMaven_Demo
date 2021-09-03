package com.model;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 3, 2021
 */
public class TheWeatherIsWarm {

	public boolean isTheWeatherWarmOrNot = false;
	int weather;
	public final int ifHigherThanOrEqualToThisNumberTheWeatherIsWarm = 61;
	public final int ifLowerThanOrEqualToThisNumberTheWeatherIsWarm = 79;
	public final int ifHigherThanOrEqualToThisNumberTheWeatherIsHot = 80;
	public final int ifLowerThanOrEqualToThisNumberTheWeatherIsCold = 60;
	
	public int getWeather( int i) {
		this.weather = i;
		return weather;
	}
	
	public boolean isTheWeatherWarm() {
		
		if (weather >= ifHigherThanOrEqualToThisNumberTheWeatherIsWarm && weather <= ifLowerThanOrEqualToThisNumberTheWeatherIsWarm) {
			
			isTheWeatherWarmOrNot = true;
		}
		
		return isTheWeatherWarmOrNot;
	}
	
}
