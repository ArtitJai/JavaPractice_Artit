package day19_taskSubmissionArtitJaikwang;

import java.util.Scanner;

public class Task_3EstimateTheNumberOfServing {

	public static void main(String[] args) {
		
		int water = 200, milk = 50, bean = 15;
		int requireWater, requireMilk, requireBean; 
		int leftWater, leftMilk, leftBean; 
		int perWater, perMilk, perBean;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many ml of water the coffee machine has:");
		int macWater = sc.nextInt();
		
		System.out.println("how many ml of milk the coffee machine has:");
		int macMilk = sc.nextInt();
		
		System.out.println("how many grams of coffee beans the coffee machine has:");
		int macBean = sc.nextInt();
		
		System.out.println("how many cups of coffee you will need:");
		int cup = sc.nextInt();
		
		requireWater = water * cup;
		requireMilk = milk * cup;
		requireBean = bean * cup;
		
		if(requireWater <= macWater && requireMilk <= macMilk && requireBean <= macBean) {
			System.out.println("Yes, I can make that amount of coffee");
			
			leftWater = macWater - requireWater;
			leftMilk = macMilk - requireMilk;
			leftBean = macBean - requireBean;
			
			if(leftWater >= water &&  leftMilk >= milk && leftBean >= bean) {
				
				perWater = leftWater / water;
				perMilk = leftMilk / milk;
				perBean = leftBean / bean;
				
				if(perWater > 0 && perMilk > 0 && perBean > 0) {
					
					int[] lowest = {perWater, perMilk, perBean};
					
					int min = lowest[0];
					
					for(int i = 0; i < lowest.length; i++) {
						if(lowest[i] < min) {
							min = lowest[i];
						}
					}
					
					System.out.println(min + "  cup(s) can be made");
				}
			}
			else {
				System.out.println("Can not make anymore coffee");
			}
			
		}
		else {
			System.out.println("required for refill");
		}
		
			
		
		sc.close();

	}

}
//	#Stage 3/6: Estimate the number of servings
//	##Description
//	A real coffee machine never has an infinite supply of water, milk, or coffee beans. 
//	And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.
//	
//	In this stage, you need to improve the previous program. 
//	Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.
//	
//	If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". 
//	If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", 
//	where N is the number of additional cups of coffee that the coffee machine can make. 
//	If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".
//	
//	Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.
//	
//	##Instruction
//	Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.
//	
//	##Examples
//	The program should firstly request for water, then milk, then beans, and then the number of cups.
//	The symbol > represents the user input. Note that it's not part of the input.
//	
//	###Example 1
//	```text
//	Write how many ml of water the coffee machine has:
//	> 300
//	Write how many ml of milk the coffee machine has:
//	> 65
//	Write how many grams of coffee beans the coffee machine has:
//	> 100
//	Write how many cups of coffee you will need:
//	> 1
//	Yes, I can make that amount of coffee
//	```
//	###Example 2
//	```text
//	Write how many ml of water the coffee machine has:
//	> 500
//	Write how many ml of milk the coffee machine has:
//	> 250
//	Write how many grams of coffee beans the coffee machine has:
//	> 200
//	Write how many cups of coffee you will need:
//	> 10
//	No, I can make only 2 cup(s) of coffee
//	```
//	###Example 3
//	```text
//	Write how many ml of water the coffee machine has:
//	> 1550
//	Write how many ml of milk the coffee machine has:
//	> 299
//	Write how many grams of coffee beans the coffee machine has:
//	> 300
//	Write how many cups of coffee you will need:
//	> 3
//	Yes, I can make that amount of coffee (and even 2 more than that)
//	```
//	###Example 4
//	```text
//	Write how many ml of water the coffee machine has:
//	> 0
//	Write how many ml of milk the coffee machine has:
//	> 0
//	Write how many grams of coffee beans the coffee machine has:
//	> 0
//	Write how many cups of coffee you will need:
//	> 1
//	No, I can make only 0 cup(s) of coffee
//	```
//	###Example 5
//	```text
//	Write how many ml of water the coffee machine has:
//	> 0
//	Write how many ml of milk the coffee machine has:
//	> 0
//	Write how many grams of coffee beans the coffee machine has:
//	> 0
//	Write how many cups of coffee you will need:
//	> 0
//	Yes, I can make that amount of coffee
//	```
//	###Example 6
//	```text
//	Write how many ml of water the coffee machine has:
//	> 200
//	Write how many ml of milk the coffee machine has:
//	> 50
//	Write how many grams of coffee beans the coffee machine has:
//	> 15
//	Write how many cups of coffee you will need:
//	> 0
//	Yes, I can make that amount of coffee (and even 1 more than that)
//	```