package com.Thread;
// ctrl+o =open methods
public class A extends Thread {
	public void run(){
		for (int i = 0; i <5; i++) {
			System.out.println("hi");
		}
	}
	//explain life cycle of thread
	//1.new born Stage
	//2.Runnable/ start
	//3.wait
	//4.running
	//5.Dead

	public static void main(String[] args) {
		A obj=new A();
	    Thread t=new Thread(obj);
		t.start();//it start the execution of run method
		//t.run();
		//t.setName("A");
		//System.out.println(t.getName());
	
	for (int i = 1; i < 4; i++) {
		System.out.println(i);
	}
	}
	

}
