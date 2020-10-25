package com.sytax.class04;

public class exercise02 {

	public static void main(String[] args) {
	 
		double score=3.5;
	    boolean diploma=true;
	    
	    if(diploma) {
	    	System.out.println("Congratulation");
	    	if(score>=4.5) {
	    		System.out.println("You are elegible for schoolarship");
	    	}else {
	    		System.out.println("You should have studied harder");
	    	}
	    		
	    }else {
	    	System.out.println("You should get degree");
	    }
	     
	    System.out.println("---------------------------------------------------------------");
	    
	    double rate=3.5;
	    int price=300000;
	    
	    if(rate>4.5) {
	    	System.out.println("Buyer will not buy a house");
	    }else {
	    	System.out.println("Buyer will buy");
	    }
	    if(price>200000) {
	    System.out.println("Buyer will take a loan");
	} else {
		System.out.println("Buyer will pay cash");
	}

	}

}
