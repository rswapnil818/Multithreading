package com.Thread1;

public class Bmain {

	public static void main(String[] args) {
		int n=8; 
		for (int i = 0; i < 8; i++) {
			B bm=new B();
			bm.start();
		}
	}

}
