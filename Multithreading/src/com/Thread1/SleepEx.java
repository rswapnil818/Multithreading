package com.Thread1;

public class SleepEx extends Thread{
 public void run(){
	 for(int i=0; i<5; i++){
		 try{
			 Thread.sleep(1500);
		 }catch(Exception e){
		 System.out.println(e);
	 }
		 System.out.println(i);
 }}
	public static void main(String[] args) {
		SleepEx ex=new SleepEx();
		SleepEx ex1=new SleepEx();
		ex.start();
		ex1.start();
		for(int i=0; i<=5; i++){
			System.out.println("hello");
		}
	}

}
