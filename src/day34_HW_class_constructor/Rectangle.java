package day34_HW_class_constructor;

public class Rectangle {
	
	/*1. 
	create a custom class named Rectangle
	    Attributes:
	        length, width
	    Add a constructor that can set all the fields
	    Actions:
	        calculateArea(): calculates the area of the rectangle, returns it as double
	        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
	     	toString(): displays the width, length, area and perimeter of the rectangle 
	     	when an object of rectangle passed in the print statement
	     	*/
private int length;
private int width;

public Rectangle(int length, int width) {
	
	super();
	this.length = length;
	this.width = width;
}

public double calculateArea() {
	
	return length * width;
}

public double calculatePremiter() {
	
	return (2 * (length + width));
}

@Override
public String toString() {
	return "Rectangle [length=" + length + ", width=" + width + "]";
	
}
}
