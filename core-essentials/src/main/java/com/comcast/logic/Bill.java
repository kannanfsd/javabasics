package com.comcast.logic;

public class Bill {
	private String paymentMode;
	private boolean flag;

	public Bill(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public boolean validatePaymentOption() {
		if (paymentMode.equals("Credit Card") || paymentMode.equals("Debit Card") || paymentMode.equals("Paypal")
				|| paymentMode.equals("Amazon Pay") || paymentMode.equals("GPay")) {
			flag = true;
		}
		return flag;
	}

	public void validatePaymentProcess() throws Exception {
		try {
			if (!(paymentMode.equals("Credit Card") || paymentMode.equals("Debit Card") 
					|| paymentMode.equals("Paypal")
					|| paymentMode.equals("Amazon Pay") 
					|| paymentMode.equals("GPay"))) {
				throw new Exception();
			}
		} catch (Exception e) {
			throw e;
		}
	}
}
