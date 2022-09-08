package day03_1stReview;

import java.awt.Point;

public class PrimitiveVSReference {

	public static void main(String[] args) {
		
		int x = 1; // initialize x to 1
		int y = x; // assign x into y
		x = 2; // reassign x to 2
		System.out.println("x="+x+",y="+y);
		
		//=====================================
		// Reference Type Variable or non- primitive
		
		
	Point pointA = new Point(1, 1); //1,1
	Point pointB = pointA; // pointB = 1,1 | pointA = 1,1
	Point pointc = new Point  (1,3);
	
	pointA.y = 2; // pointA = 1,2 | pointB = 1,2
	System.out.println("PointA="+pointA+",PointB="+pointB);
	System.out.println(pointc);
	//===========================================
	


	}
}
