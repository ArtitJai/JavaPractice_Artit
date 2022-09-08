package day19_taskSubmissionArtitJaikwang;

import java.util.Scanner;

public class Task_5KeepTrackOfTheSupply {

	public static void main(String[] args) {
		
		int emptyCup = 9, water, milk, bean, cost;
		int requireWater, requireMilk, requireBean, totalCost;
		int storeWater = 400, storeMilk = 540, storeBean = 120, storeCash = 550;
		int cupWater, cupMilk, cupBean;
		
		do {

Scanner sc = new Scanner(System.in);

System.out.println("Would you like to buy, fill, take, remain, exit");

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
			storeCash = storeCash + totalCost;
			
			if(requireWater <= storeWater && requireBean <= storeBean){
				System.out.println(cup + " of espresso can be make");
				System.out.println("Total cost for "+ cup +" is $"+ totalCost);
				
				storeWater = storeWater - requireWater;
				storeBean = storeBean - requireBean;
				
				if(storeWater >= water && storeBean >= bean) {
					
					cupWater = storeWater / water;
					cupBean = storeBean / bean;
					
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
			storeCash = storeCash + totalCost;
			
			if(requireWater <= storeWater && requireMilk <= storeMilk && requireBean <= storeBean) {
				System.out.println(cup + " of latte can be make");
				System.out.println("Total cost for "+ cup +" is $"+ totalCost);
				
				storeWater = storeWater - requireWater;
				storeMilk = storeMilk - requireMilk;
				storeBean = storeBean - requireBean;
				
				if(storeWater >= water && storeMilk >= milk && storeBean >= bean) {
					
					cupWater = storeWater / water;
					cupMilk = storeMilk / milk;
					cupBean = storeBean / bean;
					
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
			storeCash = storeCash + totalCost;
			
			if(requireWater <= storeWater && requireMilk <= storeMilk && requireBean <= storeBean) {
				System.out.println(cup + " of cappuccino can be make");
				System.out.println("Total cost for "+ cup +" is $"+ totalCost);
				
				storeWater = storeWater - requireWater;
				storeMilk = storeMilk - requireMilk;
				storeBean = storeBean - requireBean;
				
				if(storeWater >= water && storeMilk >= milk && storeBean >= bean) {
					
					cupWater = storeWater / water;
					cupMilk = storeMilk / milk;
					cupBean = storeBean / bean;
					
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
storeWater += water;
System.out.println("how many ml of milk you want to add:");
milk = sc.nextInt();
storeMilk += milk;
System.out.println("how many grams of coffee beans you want to add:");
bean = sc.nextInt();
storeBean += bean;
System.out.println("how many disposable cups of coffee you want to add:");
int cup = sc.nextInt();
emptyCup += cup;

System.out.println("The coffee machine has:\n");
System.out.println(storeWater + " ml of water");
System.out.println(storeMilk + " ml of milk");
System.out.println(storeBean + " g of coffee bean");
System.out.println(emptyCup + " disposable cups");
System.out.println("$" + storeCash + " of money");


}else if(act.equalsIgnoreCase("take")) {

System.out.println("Machine have $" + storeCash);
System.out.println("How much would you like to take money off?");
int cashOut = sc.nextInt();

if(cashOut <= storeCash) {
	System.out.println("$" + cashOut + " take this amount out of machine\n");
	storeCash -= cashOut;
	System.out.println("Have this amount left in machine $" + storeCash);	
}
else {
	System.out.println("Money inefficientcy");
}


}else if(act.equalsIgnoreCase("remain")) {
	
	System.out.println("The coffee machine has:\n");
	System.out.println(storeWater + " ml of water");
	System.out.println(storeMilk + " ml of milk");
	System.out.println(storeBean + " g of coffee bean");
	System.out.println(emptyCup + " disposable cups");
	System.out.println("$" + storeCash + " of money");

	
	
}else if(act.equalsIgnoreCase("exit")) {
	break;
}

	
}while(true);

	}

}
