package com.Runnable;

public class Ex_1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running...");
		
	}


	public static void main(String[] args) {
		Ex_1 aa=new Ex_1 ();
		Thread t=new Thread(aa);
		t.start();
		
	}

}
