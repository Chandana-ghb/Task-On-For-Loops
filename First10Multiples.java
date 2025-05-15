package com.loops;

public class First10Multiples {
	public void printMultiples(int num)
	{
		int result=0;
		for(int i=1;i<=10;i++) {
			result=result+num;
			//result=num*i;
			System.out.print(result+" ");
		}
		
	}
	public static void main(String []args) {
		First10Multiples first=new First10Multiples();
		first.printMultiples(7);
	}
}
