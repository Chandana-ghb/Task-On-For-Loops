package com.loops;

public class PrintOddNumbers {

	public int printOdd() {
		int result=0;
		for(int i=1;i<=30;i++) {
			if(i%2==1) 
				result=result+i;
		}
		return result;
	}
	public static void main(String[] args) {
		PrintOddNumbers print=new PrintOddNumbers();
		System.out.println(print.printOdd());
	}
}
