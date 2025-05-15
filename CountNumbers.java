package com.loops;

public class CountNumbers {
	public int countNum() {
		int count=0;
		System.out.print("numbers:");
		for(int i=1;i<=100;i++) {
			if(i%9==0) {
				System.out.print(i+" ");
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		CountNumbers count=new CountNumbers();
		System.out.println("\nCount:"+count.countNum());
	}
}
