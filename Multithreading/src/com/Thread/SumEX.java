package com.Thread;

public class SumEX extends Thread{
	static int sum=0;
	public void run(){
		for (int i = 0; i <10; i++) {
			sum=sum+i;
		}
		System.out.println("sum ="+sum);
	}

}
