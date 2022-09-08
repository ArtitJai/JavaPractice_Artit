package day09_HW;

import java.util.Scanner;

public class Task_6_BrowserSelected {

	public static void main(String[] args) {
	
		/* 
		valid browsers: chrome, firefox, opera, safari, edge, ie
		 
		 string str = "chrome"
		  
		 outPut:
		 CHROME BROWSER IS SELECTED
		  
		 12:35
		 */


	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your browser");
		
		String browser = sc.nextLine();
		
		sc.close();
		
		switch(browser) {
		case "chrome"	:
		case "firefox"	:	
		case "opera"	:	
		case "safari"	:	
		case "edge"		:	
		case "ie"		:	
			System.out.println(browser+" BROWSER IS SELECTED");
			break;
				default:
					System.out.println("Sorry, this browser is not selected");
				
		}
		
//	
//		String browser = "FIREFOX";
//
//        if (browser == "CHROME") {
//            System.out.println("CHROME BROWSER IS SELECTED");
//
//        } else if (browser == "FIREFOX") {
//
//            System.out.println("FIREFOX BROWSER IS SELECTED");
//        } else if (browser == "OPERA") {
//
//            System.out.println("OPERA BROWSER IS SELECTED");
//        } else if (browser == "SAFARI") {
//
//            System.out.println("SAFARI BROWSER IS SELECTED");
//        } else if (browser == "EDGE") {
//
//            System.out.println("EDGE BROWSER IS SELECTED");
//        } else if (browser == "IE") {
//
//            System.out.println("IE BROWSER IS SELECTED");
//
//        } else {
//            System.out.println("INVALID BROWSER");
//        }
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
