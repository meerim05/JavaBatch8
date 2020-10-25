package com.sytax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		//*we need to compare 2 numbers;
		//*bigger,smaller or equal
		
		int num1=10;
		int num2=10;
		
		if(num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}else if(num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal "+num2);
		}
		
		System.out.println("--------------------------------------------------");
		
		/*Based on the day of the week we will print class schedule
		 * 
		 */
		
		int day=7;
		
		if(day==1) {
			System.out.println("Today is Monday we have no class");
		}else if (day==2) {
			System.out.println("Today is Tuesday we have Manual class");
		}else if(day==3) {
			System.out.println("Today is Wednesday we have Manual class again");
		}else if (day==4) {
			System.out.println("Today is Thursday we have Review class");
		}else if (day==5) {
			System.out.println("Today is Friday I will prepare");
		}else if(day==6) {
			System.out.println("Today is Saturday we will have Java class");
		}else if (day==7) {
			System.out.println("Today is Sunday I did a lot of coding");
		}else {
			System.out.println("This is invalid entry,please provide valid day from 1 to 7");
		}
		
		}
		

	}


