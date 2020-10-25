package com.sytax.class04;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		 int num=80;
		 String str="I am String";
		 
		 Scanner scan=new Scanner(System.in);//enable input to the console
         String value=scan.nextLine();//waits for your input and once you provided input-->hit enter
         System.out.println("I capture value="+value);
         
         System.out.println("Please enter your name");
         String name=scan.nextLine();
         System.out.println("Nice to meet you "+name);
	}

}
