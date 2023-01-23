package com.Thread1;
//Java code for Thread creation by extending the thread class
public class B extends Thread {
    public void run(){
    	try{
    		System.out.println("Thread"+Thread.currentThread().getId()+" Is Running");
    	}catch(Exception e){
    		System.out.println("Exception is Caught");
    	}
    }
	}

