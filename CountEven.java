package com.loops;

public class CountEven {
	
	public int countNumbers() {
	
		int count=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0) 
				count=count+1;
		}
		return count;
	}
	public static void main(String[] args) {
		CountEven count=new CountEven();
		System.out.println(count.countNumbers());
	}

}
