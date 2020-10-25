package com.sytax.class04;

public class Exercise01 {

	public static void main(String[] args) {
		
		int month=7;
		if(month==1) {
			System.out.println("January");
		} else if(month==2){
			System.out.println("February");
		}else if(month==3) {
			System.out.println("March");
		}else if(month==4) {
			System.out.println("April");
		}else if(month==5) {
			System.out.println("May");
	    }else if(month==6) {
			System.out.println("June");
	    }else if(month==7) {
			System.out.println("July");	
	    }else if(month==8) {
			System.out.println("August");
	    }else if(month==9) {
			System.out.println("September");
	    }else if(month==10) {
		System.out.println("October");
	    }else if(month==11) {
			System.out.println("November");
        }else if(month==12) {
	    System.out.println("December");
        }else {
        	System.out.println("This is not number for month");
        }
		
		System.out.println(("--------------------------------------------"));
		
		// 2task
		
		int n1=-8;
		int n2=3;
		
		if(n1>=0) {
			System.out.println(n1+" is positive");
		}else {
			System.out.println(n1+" is negative");
		}  
		if (n2>=0){
			System.out.println(n2+" is positive");
		}else {
			System.out.println(n2+" is negative");
		}
		
		System.out.println("----------------------------------------------------");
		// number even or odd
		int i=46;
		if(i%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("number is odd");
		}
}
}

