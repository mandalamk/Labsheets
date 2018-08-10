package com.cg.demo;

public class Consumer implements Runnable{

	MyStack stack;
	
	public Consumer(MyStack stack) {
		super();
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
		stack.pop();
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
