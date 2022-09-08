package day06_controlFlow;

public class EligibleToBuyAlcohol {

	public static void main(String[] args) {
		
		 /*
        1. write a program that can check if the person is eligible to buy alcohol
               AGE should older 21
                Ex:
                    name = "James"
                    age = 19
                    output:
                        James is eligible to buy alcohol?
                            false
         
		
		
		String name = "James";
		int age = 20;
		
		System.out.println(name +" is eligible to buy alcohol?");
		
		if (!(age < 0)) or if (age >=0 && age <=125) {
		
		if (age >=0 && age < 21) {
			System.out.println("False");
		}
		if (age >=21 && age <= 125) {
			System.out.println("true");
		}	
		
		}
		else {System.out.println("Invalid age");

		}*/
		
		// ******Try to use an easy method that easy to read
			
		String name = "James";
		int age = 20;
		String message = name + " is eligible to buy alcohol?";
		boolean isEligible = age >=21;
		
		System.out.println(message);
		System.out.println(isEligible);
				
		}
		

}
