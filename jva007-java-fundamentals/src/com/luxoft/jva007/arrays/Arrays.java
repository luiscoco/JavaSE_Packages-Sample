package com.luxoft.jva007.arrays;

public class Arrays {
	public static void main(String[] args) {
		int [] array = new int[5];
		
		for (int i=0; i<5; i++) {
			array[i] = i+1;
		}

		System.out.println(array.length);
		//ArrayIndexOutOfBoundsException
        //System.out.println(array[6]);
	}

}
