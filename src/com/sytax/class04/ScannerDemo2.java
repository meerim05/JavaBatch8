package com.sytax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();//waiting for input
		
		if (rain) {
			System.out.println("Please take a umbrella");
		}else {
			System.out.println("It is nice weather go for a walk ");
			
			
			System.out.println("================Lets capture int value=============");
			
			System.out.println();
		}
	}

}
