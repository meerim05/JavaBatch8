package com.sytax.class04;

public class NestedIf {

	public static void main(String[] args) {
	/*
	 * variable for allergy yes or no
	 * 
	 * if allergy is yes--->
	 *                 we will check if pet allergy 
	 *                 if peanut allergy  
	 *                 if pollen allergy
	 * if no allergy You lucky                
	 */
		
		boolean allergy=false;
		
		boolean petAllergy=true;
		//boolean peanutAllergy=true;
		//boolean polleanAllergy=true;
		if(allergy) {
			System.out.println("Lets do further check");
			
		if(petAllergy) {
			System.out.println("Please no cats or dogs on the house");
		}else {
			System.out.println("That is good you do not have pet allergy");
		}
		}else {
			System.out.println("You are lucky");
		}
         /*
          * if today is Friday we will watch movie but would check the date
          * if date is 13--->watching scary movie
          * and if it is not--->I will watch comedy
          * if no Friday --->I am studying
          */
		
		boolean isFriday=true;
		int date=4;
		if(isFriday) {
			if (date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch PK movie");
			}
			
		}else {
			System.out.println("Today is not Friday, I am studying");
		}
		/*check if assignment is completed
		 * if assignment is completed;
		 * if score>90 great job
		 * if score>80 good job
		 * if score>70 please study 
		 */
		
		int score=92;
		boolean assignment=true;
		
		if (assignment) {
			if(score>90) {
				System.out.println("You did great!!!");
			}else if (score>80) {
				System.out.println("You did good");
			}else if (score>70) {
				System.out.println("Probably you need to study more");
			}else {
				System.out.println("Good job fo rtrying you must study");
			}
	}else {
		System.out.println("You should always complete all assignments");
	}

}
}