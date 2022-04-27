package com.comcast.threading;

class A{
	void methodA() {		// thread (t2)
		System.out.println("A-Thread is executed.");
	}
}
class B extends Thread{		// explicit thread (t3)
	@Override
	public void run() {
		System.out.println("B-Thread run() method executed.");
	}
}
class C implements Runnable{
	@Override
	public void run() {
		
	}
}
public class AppThread {
	public static void main(String[] args) {		// application thread (t1)
		System.out.println("App.Thread is initiated.");
		System.out.println("App. Thread is running");
		Thread t1 = Thread.currentThread();
		t1.setName("comcast");
		t1.setPriority(Thread.MIN_PRIORITY+5);
		//System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		A objA = new A();
		objA.methodA();
		B objB = new B();
		objB.start();  									// invoke to run() parallel process 
		System.out.println("App. Thread is stopped.");
	}
}
