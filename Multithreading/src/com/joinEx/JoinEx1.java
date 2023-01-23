package com.joinEx;

public class JoinEx1 extends Thread{
    public void run(){
    	for (int i = 0; i <5; i++) {
    		try{
    			Thread.sleep(1000);
    		}catch(Exception e){
    			System.out.println(e);
    			}
    		
    			System.out.println(i);
    		}
			
		}
    
	public static void main(String[] args) {
		JoinEx1 je1=new JoinEx1();
		JoinEx1 je2=new JoinEx1();
		JoinEx1 je3=new JoinEx1();
		
		je1.start();
		try{
			je1.join();
		}catch(Exception e1){
			System.out.println(e1);
			je2.start();
			je3.start();
		}

	}

}
