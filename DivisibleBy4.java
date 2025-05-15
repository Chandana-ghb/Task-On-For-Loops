package com.loops;

public class DivisibleBy4 {
	public void displayMultiples() {
		for(int i=1;i<=100;i++) {
			if(i%4!=0) 
				System.out.println(i);
		}
	}
	public static void main(String []args) {
		DivisibleBy4 div=new DivisibleBy4();
		div.displayMultiples();
	}
}
