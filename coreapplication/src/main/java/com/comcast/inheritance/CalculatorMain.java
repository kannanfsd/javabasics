package com.comcast.inheritance;

class BasicCalculator {
	int num1;
	int num2;
	void addition() {
		System.out.println(num1+num2);
	}
	void subtraction() {
		System.out.println(num1-num2);		
	}	
}
class ScientificCalculator extends BasicCalculator {
	void sinValue() {
		System.out.println(Math.sin(num1));
	}
	void cosValue() {
		System.out.println(Math.cos(num1));
	}
}

public class CalculatorMain {
	public static void main(String[] args) {
//		BasicCalculator bCalc = new BasicCalculator();
//		bCalc.num1 = 16;
//		bCalc.num2 = 14;
//		bCalc.addition();
//		bCalc.subtraction();
		
		ScientificCalculator sCalc = new ScientificCalculator();
		sCalc.num1 = 12;
		sCalc.num2 = 15;
		sCalc.addition();
		sCalc.subtraction();
		sCalc.sinValue();
		sCalc.cosValue();
	}
}
