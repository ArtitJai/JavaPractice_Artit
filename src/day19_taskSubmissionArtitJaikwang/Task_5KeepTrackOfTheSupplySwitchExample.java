package day19_taskSubmissionArtitJaikwang;

import java.util.Scanner;

public class Task_5KeepTrackOfTheSupplySwitchExample {
	
        
        public static void main(String[] args) {

    		int water = 0, milk = 0, bean = 0, cups = 0, money = 550; 
    		int supplyWater = 400, supplyMilk = 540, supplyBean = 120, 
    			supplyCup = 9;
    					
    		Scanner scan = new Scanner(System.in);
    		
    		
    			
    		System.out.println("Enter your selection buy, fill, take, remaining, exit");
    		String select = scan.next();
    		
    			
    		switch (select) {
    		case "buy":
    			
    			System.out.println("What do you want to buy: 1 -espresso, 2 -latte, 3 -cappuccino, 4 -back to main menu");
    			int option = scan.nextInt();
    			
    			switch (option) {
    			case 1: //buy espresso
    				if(supplyWater < 250) {
    					System.out.println("Sorry, not enough water!");
    					
    				}else if(supplyBean < 16) {
    					System.out.println("Sorry, not enough bean!");
    					
    				}else if(supplyCup < 1) {
    					System.out.println("Sorry, not enough disposable cups! ");
    					
    				}else {
    					supplyWater = supplyWater - 250;
    					supplyBean = supplyBean - 16;
    					supplyCup = supplyCup - 1;
    					money = money + 4;
    				
    					System.out.println("I have enough resources, making you a coffee!");
    				}
    				break;
    				
    			case 2: // buy latte
    				if(supplyWater < 350) {
    					System.out.println("Sorry, not enough water!");
    					
    				}else if(supplyMilk < 75){
    					System.out.println("Sorry, not enough milk!");
    					
    				}else if(supplyBean < 20) {
    					System.out.println("Sorry, not enough bean!");
    					
    				}else if(supplyCup < 1) {
    					System.out.println("Sorry, not enough disposable cups! ");
    					
    				}else {
    					supplyWater = supplyWater - 350;
    					supplyMilk = supplyMilk - 75;
    					supplyBean = supplyBean - 20;
    					supplyCup = supplyCup - 1;
    					money = money + 7;
    				
    					System.out.println("I have enough resources, making you a coffee!");
    				}
    				break;
    			
    			case 3: // buy cappuccino
    				if(supplyWater < 200) {
    					System.out.println("Sorry, not enough water!");
    					
    				}else if(supplyMilk < 100){
    					System.out.println("Sorry, not enough milk!");
    					
    				}else if(supplyBean < 12) {
    					System.out.println("Sorry, not enough bean!");
    					
    				}else if(supplyCup < 1) {
    					System.out.println("Sorry, not enough disposable cups!");
    					
    				}else {
    					supplyWater = supplyWater - 200;
    					supplyMilk = supplyMilk - 100;
    					supplyBean = supplyBean - 12;
    					supplyCup = supplyCup - 1;
    					money = money + 6;
    				
    					System.out.println("I have enough resources, making you a coffee!");
    				}
    				break;	
    				
    			case 4: // back to the main menu
    				System.out.println("Enter your selection buy, fill, take, remaining, exit");
    				option = scan.nextInt();
    				break;
    			}
    			break;
    				
    		case "fill":
    			System.out.println("How many ml of water you want to add:");
    			water = scan.nextInt();
    			
    			System.out.println("How many ml of milk you want to add:");
    			milk = scan.nextInt();
    			
    			System.out.println("How many gram of coffee bean you want to add:");
    			bean = scan.nextInt();
    			
    			System.out.println("How many disposable cups of coffee you want to add:");
    			cups = scan.nextInt();
    			
    			supplyWater = supplyWater + water ;
    			supplyMilk = supplyMilk + milk;
    			supplyBean = supplyBean + bean;
    			supplyCup = supplyCup + cups;
    			money = 550;
    			
    			System.out.println("The coffee machine has:");
    			System.out.println(supplyWater+ " ml of water "+supplyMilk+ " ml of milk "
    			+ supplyBean+ " g of coffee bean "+supplyCup+ " disposable cups "+"$"+money+ " of money");
    			
    			break;
    			
    		case "take":
    			money = 0;
    			System.out.println("I gave you $" + money);
    			
    			break;
    		
    		case "remaining":
    			System.out.println("The coffee machine has:");
    			System.out.println(supplyWater+ " ml of water " + supplyMilk + " ml of milk " + supplyBean 
    					+ " g of coffee bean "+ supplyCup + " diposable cups " + "$" + money + " of money");
    			System.out.println("===================================================================================");
    			
    			System.out.println("Enter your selection buy, fill, take, remaining, exit");
    			select = scan.next();
    			
    			break;
    			
    		case "exit":
    			
    			break;
    		}
    		scan.close();
	}
					
		}


