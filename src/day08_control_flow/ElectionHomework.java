package day08_control_flow;

import java.util.Scanner;

public class ElectionHomework {

	public static void main(String[] args) {
		


		        Scanner EmreBaba = new Scanner(System.in);
		        
		        System.out.println("Who is planning to vote?");
		        
		        String name = "";
		        
		        name = EmreBaba.next();
		        
		        System.out.println("How old is " + name + "?");
		        
		        int age = EmreBaba.nextInt();
		        
		        
		        System.out.println("Is " +name+ " a US citizen?");
		        
		        
		        String answer = EmreBaba.next();
		        
		        
		        if (age >= 18 && answer.equals("yes")) {
		            System.out.println(name + " is eligible to vote for Donald Trump or Joe Biden.");
		        }
		        
		        if (age <18 || answer.equals("no")) {
		            System.out.println(name + " is not eligible to vote for Donald Trump or Joe Biden.");
		        }
		        
		        
		        
		        EmreBaba.close();
		        

		    }

		

	}


