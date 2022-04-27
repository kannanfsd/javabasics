package com.comcast.threading;

class Table {
	// Option -1 for using synchronized keyword
	public synchronized void display1(int num) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// Option-2 for create synchronized block
	public void display2(int num) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class PrintTable extends Thread {
	Table t;
	int num;

	PrintTable(Table t, int num) {
		this.t = t;
		this.num = num;
	}

	@Override
	public void run() {
		t.display1(num);
	}
}

public class PrintTableMain {
	public static void main(String[] args) {
		final Table obj = new Table();
		PrintTable pTable1 = new PrintTable(obj, 5);
		pTable1.start();
		PrintTable pTable2 = new PrintTable(obj, 8);
		pTable2.start();
	}
}
