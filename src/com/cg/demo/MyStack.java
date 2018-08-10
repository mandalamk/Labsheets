package com.cg.demo;

public class MyStack {

	private int val=-999;
	private boolean aval=false;

	public MyStack() {
		// TODO Auto-generated constructor stub
	}

	public synchronized void push(int n) {
		// TODO Auto-generated method stub
		val = n;
		aval = true;	
		this.notify();
		System.out.println("Pushed "+val);
	}

	public synchronized int pop() {
		// TODO Auto-generated method stub
		//boolean b = true;
		if(!aval)
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		aval=false;
		System.out.println("Popped "+val);
		return val;
	}

}
