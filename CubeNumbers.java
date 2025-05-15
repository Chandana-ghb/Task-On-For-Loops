package com.loops;

public class CubeNumbers {

	public void printCubes()
	{
		int result=1;
		for(int i=1;i<10;i++) {
			result=i*i*i;
			System.out.println(i+"^"+"3"+"="+result);
		}
	}
	public static void main(String[] args) {
		CubeNumbers cube=new CubeNumbers();
		cube.printCubes();
	}
}
