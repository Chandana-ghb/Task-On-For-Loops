package com.loops;

public class DivisibleByEither4Or6 {

	public void displayNumbers() {
		for(int i=1;i<=50;i++) {
			if(i%4==0||i%6==0) 
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		DivisibleByEither4Or6 display=new DivisibleByEither4Or6();
		display.displayNumbers();
	}
}
