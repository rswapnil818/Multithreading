package com.Thread1;

public class GetSet extends Thread {
      
	public void run(){
		System.out.println("running...");
	}
	public static void main(String[] args) {
		GetSet t1=new GetSet();
		GetSet t2=new GetSet();
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("Name of t2:"+t2.getName());
		System.out.println("Name of t1:"+t1.getId());
        t1.start();
        t2.start();
        t1.setName("Java By Kiran");
        System.out.println("After Changing name of t1: "+t1.getName());
	}

}
