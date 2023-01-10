package com.Matrix;

public class Matrix {
	public static void main(String args[]) throws InterruptedException {
		Matrix();
	}
	
	public static void Matrix() throws InterruptedException {
	     while(true) {
		for(int i = 0; i < 50; i++) {		 
		    if(i <= 50) {
		      System.out.println();
		    	for(int z = 0; z < 90; z++) {
		          Thread.sleep((long) 0.8);
				  float randomthree = (float) Math.random() * 2;
				  System.out.print((int) randomthree + " ");
		    			}
		    		}
			}
		}
	}
}