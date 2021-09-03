package com.model;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 1, 2021
 */
	public class Dollar {
		
		public int amount;
		
		public Dollar (int amount) {
			// TODO Auto-generated constructor stub
			
			this.amount = amount;
		
		}

	public Dollar times(int multiplier) {
	return new Dollar(amount * multiplier);
		
	}
}
