package com.comcast.exception;

class Demo {	// with unchecked exception as ArithmeticException
	public int division(int dividend, int divisor) throws ArithmeticException {
		int result = dividend/divisor;
		return result;
	}
}
class Check {	// with checked exception as DivisionException (customized one)
	public int division(int dividend, int divisor) throws DivisionException {
		if(divisor == 0) {
			throw new DivisionException("Divisor as Zero.");
		}
		int result = dividend/divisor;
		return result;
	}
}

public class ThrowsDemo {
	public static void main(String[] args) {
//		Demo demoObj = new Demo();
		int response = 0;
//		response = demoObj.division(12, 0);
//		try {
//			response = demoObj.division(12, 0);			
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("Result is "+response);
//		}		
		
		Check chkObj = new Check();
		try {
			response = chkObj.division(12, 0);
		} catch (DivisionException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("Exception Occured, "+e.getMessage());
		}finally {
			System.out.println("Result is "+response);
		}
		
	}
}
