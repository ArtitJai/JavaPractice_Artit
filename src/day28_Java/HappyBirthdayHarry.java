package day28_Java;

import java.time.LocalDate;

public class HappyBirthdayHarry {

	public static void main(String[] args) {
			
			System.out.println(LocalDate.now());
			
			LocalDate date = LocalDate.now();
			
			int month = date.getMonth().getValue();
			
			int day = date.getDayOfMonth();
			
			System.out.println(month);
			
			System.out.println(day);
			
			LocalDate birthDay = LocalDate.of(1990, 07, 31);
			
			int month2 = birthDay.getMonth().getValue();
			int day2 = birthDay.getDayOfMonth();
			
			if(month == month2 && day == day2) {
				System.out.println("Happy twenty fine Harry Potter");
			}
		}

	}


