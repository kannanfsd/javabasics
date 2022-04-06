package com.comcast.statement;

class WelcomeMessage {
	void printMessage() {
		System.out.println("Welcome to All.");
	}
	void doWhileTest() {
		int i = 6;
		do {
			System.out.println("i value is "+i);
			i++;
		}while(i<5);
	}
	void forLoopTest() {
		for(int i=1;i<=10;i++) {
			System.out.println("i value is "+i);
		}
	}
	void transferTest() {
		int i;
		System.out.println("TransferDemo begin.");
		for(i=1;i<=10;i++) {
			if(i==4) {
				continue;
			}
			if(i==8) {
				//break;
				return;
			}
			System.out.println("Counter:: "+i);
		}
		System.out.println("TransferDemo end.");
	}
}
public class TestProgram {
	public static void main(String[] args) {
		WelcomeMessage welcomeMessage = new WelcomeMessage();
		int n = 5;
		System.out.println("While Test..");
		while(n>0) {
			//welcomeMessage.printMessage();
			n--;
		}
		System.out.println("Do-While Test..");
		//welcomeMessage.doWhileTest();
		System.out.println("For Test..");
		//welcomeMessage.forLoopTest();
		welcomeMessage.transferTest();
		
	}
}
