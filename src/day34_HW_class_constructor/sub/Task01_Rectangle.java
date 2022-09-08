package day34_HW_class_constructor.sub;

import day34_HW_class_constructor.Rectangle;

public class Task01_Rectangle {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(15, 10);
		
		System.out.println("The area of rectangle is : " + rect.calculateArea());
		System.out.println("The area of premiter is : " + rect.calculatePremiter() + "\n");
		System.out.println(rect.toString());
	}
}

