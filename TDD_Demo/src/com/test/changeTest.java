package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.model.Change;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Sep 1, 2021
 */
public class changeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void quotientTest() {
		Change ten = new Change(10);
		ten.divide(1);
		assertEquals(10, ten.quotient);
	
	}

}
