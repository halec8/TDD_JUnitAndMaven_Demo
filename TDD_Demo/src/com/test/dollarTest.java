package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.model.Dollar;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 1, 2021
 */
public class dollarTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void multiplicationTest() {
		
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}

}
