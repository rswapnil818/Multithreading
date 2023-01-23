package com.Runnable;

public class Ex_2 implements Runnable {
	public void run(){
		try{
			System.out.println("Thread "+Thread.currentThread().getId()+" is Running");
			
		}catch(Exception e){
			System.out.println("Exception is Caught");
		}
	}

	public static void main(String[] args) {
		int n=8;
		for (int i = 0; i < 8; i++) {
			Ex_2 ab=new Ex_2();
			Thread aa=new Thread(ab);
			aa.start();
			
		}
	}

}
