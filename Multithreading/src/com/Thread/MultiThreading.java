package com.Thread;

public class MultiThreading extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("hi");
		}
	}

	public static void main(String[] args) {
		MultiThreading mn=new MultiThreading();
		Thread t=new Thread(mn);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

}
