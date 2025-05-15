package com.loops;

public class PrintEvenNumbers {
	
	public void displayNumbers() {
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) 
				System.out.print(i+" ");
		}
	}
	public static void main(String []args) {
		PrintEvenNumbers print=new PrintEvenNumbers();
		print.displayNumbers();
	}

}
