package day10_HW;

import java.util.Scanner;

public class Task2_CampusTime {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("please, provide hour from 1-24 for check campus open hours");
		
		int hrs = sc.nextInt();
		
		if(hrs >= 8 && hrs <=23) {
			System.out.println("Campus open");
		}
		
		else {
			System.out.println("Campus closed");
		}
		
		
		sc.close();
		
		
	}

}

//## Task2
//` Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has
//been initialized, write a program that can find out if the campus is open or not.
// Campus is open from 8 am(8) to
//11 pm (23) If user enters a time within the open time they should see message: “open”  but if the time entered is
//outside of operating hours they should see: “ closed”



