package com.comcast.exception;

public class ThirdDemo {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Welcome back to, Java@11 SE API Session.");
		}
	}
}
