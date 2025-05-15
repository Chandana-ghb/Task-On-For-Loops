package com.loops;

public class MultiplicationTable {
	public void printMultiplicationTable(int num)
	{
		for(int i=10;i>=1;i--) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}
	public static void main(String[] args) {
		MultiplicationTable multiply=new MultiplicationTable();
		multiply.printMultiplicationTable(6);
	}
}
