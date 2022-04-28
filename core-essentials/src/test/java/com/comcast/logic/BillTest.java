package com.comcast.logic;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BillTest {
	
	@Rule
	public ExpectedException ee;

	@Test
	public void validatePaymentOptionTestValid() {
		Bill bill = new Bill("GPay");
		Assert.assertTrue(bill.validatePaymentOption());
	}
	
	@Test
	public void validatePaymentOptionTestInValid() {
		Bill bill = new Bill("Google Pay");
		Assert.assertFalse(bill.validatePaymentOption());
	}

	@Test(expected = Exception.class)
	public void validatePaymentOptionException()throws Exception {
		//ee.expect(Exception.class);
		ee.expectMessage("Please provide valid payment options.");
		Bill bill = new Bill("GPay");
		bill.validatePaymentProcess();					
	}
}
