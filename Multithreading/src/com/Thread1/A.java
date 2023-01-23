package com.Thread1;

public class A implements Runnable {

	public static void main(String[] args) {
		Thread A=new Thread("java");
		Thread A1=new Thread("Advance java");
		A.start();
		A1.start();
		System.out.println("Threads Names Are following : ");
		System.out.println(A.getName());
		System.out.println(A1.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
