package com.Thread1;

public class PriorityEx extends Thread {
      public void run(){
    	  System.out.println("Running thread name is : "+currentThread().getName());
    	  System.out.println("Running thread name is : "+currentThread().getPriority());
      }
	public static void main(String[] args) {
		PriorityEx ex=new PriorityEx();
		PriorityEx ex1=new PriorityEx();
		ex.setPriority(MIN_PRIORITY);
		ex1.setPriority(MAX_PRIORITY);
		ex.start();
		ex1.start();
	}

}
