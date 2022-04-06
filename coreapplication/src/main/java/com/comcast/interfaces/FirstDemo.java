package com.comcast.interfaces;

interface ISecond {
	String text = "Welcome to Interface Env.";
	void display4();
}

public class FirstDemo implements IFirst, ISecond{
	
	public static void main(String[] args) {
		IFirst iFirst = new FirstDemo();
		System.out.println("Final pi Value: "+pi);
		System.out.println("Final message Value: "+message);
		iFirst.display1();
		iFirst.display2();
		IFirst.display3();
	}
//	@Override
//	public void display1() {
//		System.out.println("IFirst Abstract - Interface concreate method.");
//	}
//	@Override
//	public void display4() {
//		System.out.println("ISecond Abstract - Interface concreate method.");		
//	}

	@Override
	public void display4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		
	}

}
