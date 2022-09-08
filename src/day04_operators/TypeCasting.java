package day04_operators;

public class TypeCasting {
	
public static void main(String[] args) {
	
/* Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte 
 */
	
	
	int a = 10;
	double b = a;
	
	System.out.println(a);
	System.out.println(b);
	
	long c = 7000000L;
	float d = c;
	
	System.out.println(d);
	
	
	/*
	Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte 
	 
	 */
	
	int valueA = 10;
	byte valueB = (byte)valueA;
	
	System.out.println(valueA);
	System.out.println(valueB);
	
	int valueC = 300;
	byte valueD = (byte)valueC; // byte can hold -128 ~ 127
	
	System.out.println(valueD);
	
	
	double e = 40000;
	
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.MIN_VALUE);
	
	short f = (short)e;
	System.out.println(f);
	
	double h = f;
	
	System.out.println(h);
	
	
	
	
	
	
	
	
	
	
}
}
