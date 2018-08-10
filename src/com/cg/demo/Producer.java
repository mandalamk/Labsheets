package com.cg.demo;

public class Producer implements Runnable {

	MyStack stack;
	
	public Producer(MyStack stack) {
		// TODO Auto-generated constructor stub
		this.stack = stack;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		
		int i=20;
		while(i>0)
		{
		// TODO Auto-generated method stub
		int n = (int)(Math.random()*10);
		stack.push(n);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i--;
		}
	}

}
