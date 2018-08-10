package com.cg.demo;

public class DemoMain {

	public DemoMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack stack = new MyStack();
		
		Producer p = new Producer(stack);
		Consumer c = new Consumer(stack);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		
		
	}

}
