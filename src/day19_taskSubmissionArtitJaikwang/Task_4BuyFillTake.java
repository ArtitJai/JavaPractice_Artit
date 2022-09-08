package day19_taskSubmissionArtitJaikwang;

import java.util.Scanner;

public class Task_4BuyFillTake {

	public static void main(String[] args) {
		
		int emptyCup = 9, water, milk, bean, cost;
		int requireWater, requireMilk, requireBean, totalCost;
		int storeWater = 400, storeMilk = 540, storeBean = 120, storeCash = 550;
		int cupWater, cupMilk, cupBean;
		int leftWater, leftMilk, leftBean;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to buy, fill, take");
		
		String act = sc.next();
		
		if(act.equalsIgnoreCase("buy")) {
			System.out.println("How many cup(s) of coffee would you like?");
			int cup = sc.nextInt();
			
			if(cup <= emptyCup) {
				System.out.println("Please, select 1 - espresso, 2 - latte, 3 - cappuccino");
				int coffeeType = sc.nextInt();
				
				if(coffeeType == 1) {
					water = 250;
					bean = 16;
					cost = 4;
					
					requireWater = water * cup;
					requireBean = bean * cup;
					totalCost = cost* cup;
					
					if(requireWater <= storeWater && requireBean <= storeBean){
						System.out.println(cup + " of espresso can be make");
						System.out.println("Total cost for "+ cup +" is $"+ totalCost);
						
						leftWater = storeWater - requireWater;
						leftBean = storeBean - requireBean;
						
						if(leftWater >= water && leftBean >= bean) {
							
							cupWater = leftWater / water;
							cupBean = leftBean / bean;
							
							int lowest[] = { cupWater, cupBean };
							
							int min = lowest[0];
							
							for(int i = 0; i < lowest.length; i++) {
								
								if(lowest[i] < min) {
									min = lowest[i];
								}
							}
							System.out.println(min +" cup(s) of epresso can stil be made");
						}else {
							System.out.println("Can not be made anymore");
						}
					}else {
						System.out.println("Can not be made");
				}
				}else if(coffeeType == 2) {
					water = 350;
					milk = 75;
					bean = 20;
					cost = 7;
					
					requireWater = water * cup;
					requireMilk = milk * cup;
					requireBean = bean * cup;
					totalCost = cost* cup;
					
					if(requireWater <= storeWater && requireMilk <= storeMilk && requireBean <= storeBean) {
						System.out.println(cup + " of latte can be make");
						System.out.println("Total cost for "+ cup +" is $"+ totalCost);
						
						leftWater = storeWater - requireWater;
						leftMilk = storeMilk = requireMilk;
						leftBean = storeBean - requireBean;
						
						if(leftWater >= water && leftMilk >= milk && leftBean >= bean) {
							
							cupWater = leftWater / water;
							cupMilk = leftMilk / milk;
							cupBean = leftBean / bean;
							
							int lowest[] = { cupWater, cupMilk, cupBean };
							
							int min = lowest[0];
							
							for(int i = 0; i < lowest.length; i++) {
								
								if(lowest[i] < min) {
									min = lowest[i];
								}
							}
							System.out.println(min +" cup(s) of latte can stil be made");
							
						}else {
							System.out.println("Can not be made anymore");
						}
					}else {
						System.out.println("Can not be made");
				}
					
				}else if(coffeeType == 3) {
					water = 200;
					milk = 100;
					bean = 12;
					cost = 6;
					
					requireWater = water * cup;
					requireMilk = milk * cup;
					requireBean = bean * cup;
					totalCost = cost* cup;
					
					if(requireWater <= storeWater && requireMilk <= storeMilk && requireBean <= storeBean) {
						System.out.println(cup + " of cappuccino can be make");
						System.out.println("Total cost for "+ cup +" is $"+ totalCost);
						
						leftWater = storeWater - requireWater;
						leftMilk = storeMilk = requireMilk;
						leftBean = storeBean - requireBean;
						
						if(leftWater >= water && leftMilk >= milk && leftBean >= bean) {
							
							cupWater = leftWater / water;
							cupMilk = leftMilk / milk;
							cupBean = leftBean / bean;
							
							int lowest[] = { cupWater, cupMilk, cupBean };
							
							int min = lowest[0];
							
							for(int i = 0; i < lowest.length; i++) {
								
								if(lowest[i] < min) {
									min = lowest[i];
								}
							}
							System.out.println(min +" cup(s) of latte can stil be made");
							
						}else {
							System.out.println("Can not be made anymore");
						}
						
					}else {
						System.out.println("Can not be made");
					
				}
			}
			
		}

	}else if(act.equalsIgnoreCase("fill")) {
		System.out.println("How much do you want to refill by?\n");
		System.out.println("how many ml of water you want to add:");
		water = sc.nextInt();
		System.out.println("how many ml of milk you want to add:");
		milk = sc.nextInt();
		System.out.println("how many grams of coffee beans you want to add:");
		bean = sc.nextInt();
		System.out.println("how many disposable cups of coffee you want to add:");
		int cup = sc.nextInt();
		
		System.out.println("The coffee machine has:\n");
		System.out.println((storeWater += water) + " ml of water");
		System.out.println((storeMilk += milk) + " ml of milk");
		System.out.println((storeBean += bean) + " g of coffee bean");
		System.out.println((emptyCup += cup) + " disposable cups");
		System.out.println("$" + storeCash + " of money");
	
		
	}else if(act.equalsIgnoreCase("take")) {
		
		System.out.println("Machine have $" + storeCash);
		System.out.println("How much would you like to take money off?");
		int cashOut = sc.nextInt();
		
		if(cashOut <= storeCash) {
			System.out.println("$" + cashOut + " take this amount out of machine\n");
			
			System.out.println("Have this amount left in machine $" + (storeCash -= cashOut));	
		}
		else {
			System.out.println("Money inefficientcy");
		}
		
		
	}else {
		System.out.println("Unknow Command. Please, type again");
	}

	}
}
//		# Stage 4/6: Buy, fill, take
//		
//		## Description
//		
//		Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and
//		disposable cups. Also, it counts how much money it gets for selling coffee. The coffee machine has
//		several options: first, it needs to be able to sell coffee. It can make different varieties of
//		coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of
//		supplies, except that all of them require only one disposable cup. Second, the coffee machine should
//		be able to get replenished by a special worker. Third, another special worker should be able to take
//		money from the coffee machine.
//		
//		Write the program that can do one of these actions at a time. It reads one line from the standard
//		input, which can be "buy", "fill", or "take". If you want to buy some coffee, input "buy". If you
//		are a special worker and you think that it is time to fill up all the supplies for the coffee
//		machine, input "fill". If you are another special worker and it is time to take the money from the
//		coffee machine, input "take".
//		
//		If the user writes "buy" then they must choose one of three varieties of coffee that the coffee
//		machine can make: espresso, latte, or cappuccino.
//		
//		- For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
//		- For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans.
//		  It costs $7.
//		- And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of
//		  coffee beans. It costs $6.
//		
//		If the user writes "fill", the program should ask them how much water, milk, coffee, and how many
//		disposable cups they want to add to the coffee machine.
//		
//		If the user writes "take" the program should give them all the money that it earned from selling
//		coffee.
//		
//		At the start, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans,
//		and 9 disposable cups.
//		
//		Write the program that prints the coffee machine’s state, processes one query from the user, and
//		also prints the coffee machine’s state after that. Try to use methods to implement every action that
//		the coffee machine can do.
//		
//		## Instruction
//		
//		Write a program that offers to buy one cup of coffee, to fill up the ingredients, or to take its
//		money. At the same time, the program should calculate how many ingredients it has left. And also
//		display the number of ingredients before and after purchase.
//		
//		## Examples
//		
//		An espresso should be as number 1 in the list, a latte as number 2 and a cappuccino as number 3.
//		Options also should be named as "buy", "fill", "take". The symbol `>` represents the user input.
//		Note that it's not part of the input.
//		
//		### Example 1
//		
//		```text
//		The coffee machine has:
//		400 ml of water
//		540 ml of milk
//		120 g of coffee beans
//		9 disposable cups
//		$550 of money
//		
//		Write action (buy, fill, take):
//		> buy
//		What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:
//		> 3
//		
//		The coffee machine has:
//		200 ml of water
//		440 ml of milk
//		108 g of coffee beans
//		8 disposable cups
//		$556 of money
//		```
//		
//		### Example 2
//		
//		```text
//		The coffee machine has:
//		400 ml of water
//		540 ml of milk
//		120 g of coffee beans
//		9 disposable cups
//		$550 of money
//		
//		Write action (buy, fill, take):
//		> fill
//		Write how many ml of water you want to add:
//		> 2000
//		Write how many ml of milk you want to add:
//		> 500
//		Write how many grams of coffee beans you want to add:
//		> 100
//		Write how many disposable cups of coffee you want to add:
//		> 10
//		
//		The coffee machine has:
//		2400 ml of water
//		1040 ml of milk
//		220 g of coffee beans
//		19 disposable cups
//		$550 of money
//		```
//		
//		### Example 3
//		
//		```text
//		The coffee machine has:
//		400 ml of water
//		540 ml of milk
//		120 g of coffee beans
//		9 disposable cups
//		$550 of money
//		
//		Write action (buy, fill, take):
//		> take
//		I gave you $550
//		
//		The coffee machine has:
//		400 ml of water
//		540 ml of milk
//		120 g of coffee beans
//		9 disposable cups
//		$0 of money
//		```
