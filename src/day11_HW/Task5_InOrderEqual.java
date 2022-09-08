package day11_HW;

public class Task5_InOrderEqual {

	public static void main(String[] args) {
		
		int a= 5, b = 5, c = 5;
		
		boolean equalOk = true;
		
		if(equalOk = true && a <= b && b <= c) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}

	}

}



//## Task - inOrderEqual
//
//Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6
//7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is
//allowed, such as 5 5 7 or 5 5 5.
//
//Example:
//```text
//2 5 11 false
//false
//
//5 7 6 false
//false
//
//5 5 7 true
//true
//```