package com.comcast.threading;

class Customer {
	int balance = 10000;
	public synchronized void withdraw(int amount) {
		System.out.println("I am going to withdraw.");
		if(amount>balance) {
			System.out.println("Less balance. wait for some time.");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance-=amount;
		System.out.println("Amount Received. Thank you.!");
		System.out.println("Account balance: "+balance);
	}
	public synchronized void deposit(int amount) {
		System.out.println("I am going to deposit.");
		this.balance+=amount;
		System.out.println("Deposit done.");
		notify();
	}
}

public class InterThreadMain {
	public static void main(String[] args) {
		final Customer customer = new Customer();
		new Thread() {
			public void run() {
				customer.withdraw(12450);
			}
		}.start();		
		new Thread() {
			public void run() {
				customer.deposit(5000);
			}
		}.start();
	}
}
