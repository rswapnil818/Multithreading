package com.Thread;

public class AvgEx extends SumEX {
	public void run(){
		SumEX sm=new SumEX();
		int avg=sm.sum/10;
		System.out.println("avg="+avg);
	}

}
