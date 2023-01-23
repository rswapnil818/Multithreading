package com.Thread;

public class B implements Runnable  {
	public void run(){
		for (int i = 0; i <5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("hi");
			
		}
	}

	public static void main(String[] args) {
		B b=new B();
		Thread t=new Thread(b);
		t.start();
		for (int i = 6; i < 10; i++) {
			System.out.println(i);
			
		}
	}

	
	}


