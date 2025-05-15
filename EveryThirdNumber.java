package com.loops;

public class EveryThirdNumber {
	public void printNumbers() {
		for(int i=5;i<50;i=i+3) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		EveryThirdNumber every=new EveryThirdNumber();
		every.printNumbers();
	}
}
