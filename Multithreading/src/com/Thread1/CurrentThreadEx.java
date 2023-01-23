package com.Thread1;

public class CurrentThreadEx extends Thread {
public void run(){
	System.out.println(Thread.currentThread().getName());
}

	public static void main(String[] args) {
		CurrentThreadEx ex=new CurrentThreadEx();
		CurrentThreadEx ex1=new CurrentThreadEx();
		ex.start();
		ex1.start();
		

	}

}
