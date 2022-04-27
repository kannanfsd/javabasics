package com.comcast.threading;


class RunEx implements Runnable {
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+" - Begin with run method.");	
		for(int i=0;i<5;i++) {
			System.out.println("Printing from "+threadName+", value of i is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(threadName+" - End with run method.");
	}	
}
public class RunExMain {
	public static void main(String[] args) throws InterruptedException {		
		RunEx obj1 = new RunEx();
		Thread t1 = Thread.currentThread();
		t1.setName("Copernicus");
		System.out.println(t1.getName()+" - Begin Main thread.");
		Thread t2 = new Thread(obj1, "Trinity");
		Thread t3 = new Thread(obj1, "Ohio");
		Thread t4 = new Thread(obj1, "Columbus");
		t2.start();
		t3.start();
		t4.start();
		for(int i=0;i<5;i++) {
			System.out.println("Printing from "+t1.getName()+", value of i is "+i);
			Thread.sleep(1000);
		}
		t2.join();
		t3.join();
		t4.join();		
		System.out.println(t1.getName()+" End Main thread.");
	}
}
