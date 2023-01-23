package com.Thread1;

public class Ex_2 extends Thread{
public void run(){
	System.out.println("Thread is running...");

}
public static void main(String[] args) {
	Ex_2 ex=new Ex_2();
	ex.start();
}
}
