package com.bridgelabz;

public class Maximum {
	
	public static int checkMaximum(Integer x,Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max)>0) {
			max = y; // y is maximum here
		}
		if(z.compareTo(max)>0) {
			max = z; // z is maximum now
		}
		return max; //returning maximum number.
	}

	public static void main(String[] args) {
		int c = checkMaximum(25,45,67);
		System.out.println("The maximum number is:" +c);
		

	}

}
