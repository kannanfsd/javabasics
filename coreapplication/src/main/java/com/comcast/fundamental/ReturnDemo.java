package com.comcast.fundamental;

public class ReturnDemo {	
	public String getNumberInWord(int number) {
		if(number==1) {
			return "One";
		} else if(number==2) {
			return "Two";
		} else if(number==3) {
			return "Three";
		} else {
			return "Not-matched";
		}
	}
	public String getNumberInWords(int number) {
		String inWords = "Not-Matched.";
		if(number==1) {
			inWords = "One";
		} else if(number==2) {
			inWords = "Two";
		} else if(number==3) {
			inWords = "Three";
		} 
		return inWords;
	}
	public static void main(String[] args) {
		ReturnDemo returnDemo = new ReturnDemo();
		String numberInWords = returnDemo.getNumberInWords(1);
		System.out.println("Number in Words:: "+numberInWords);
	}
}
