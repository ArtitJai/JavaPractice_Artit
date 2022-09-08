package day29_Arraylist;

import java.time.LocalDate;

public class HappyBirthday {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		
		int month = today.getMonth().getValue();
		int day = today.getDayOfMonth();
		
		System.out.println(month);
		System.out.println(day);
		
		System.out.println(today.getYear() - 23);
		
		LocalDate man = LocalDate.of(1999, 6, 16);
		
		System.out.println(man);
		
		int birthMonth = man.getMonth().getValue();
		int birthDay = man.getDayOfMonth();
		
		String name = "man";
		
		if(month == birthMonth && day == birthDay) {
			System.out.println("Happy Birthday " + name);
		}

	}

}
