package day15_4thReview;

public class MethodOfString {

	public static void main(String[] args) {
		
		String school = "techcircle school";
		String emptyString = "";
		
		school.isBlank(); // :boolean => string is empty or have white space
		
		school.isEmpty(); // :boolean => string is empty or not
		
		System.out.println(school.isEmpty());
		System.out.println(emptyString.isEmpty());
		System.out.println(emptyString.isBlank());
		System.out.println();
		
		
		String blankStr = "       ";
		System.out.println(blankStr.isEmpty());
		System.out.println(blankStr.isBlank());
		System.out.println();
		
		
		// .toUpperCase() , .toLowerCase()
		
		System.out.println(school.toUpperCase());
		System.out.println();
		
		// .startWith() , .endWith() (string) : boolean
		
		System.out.println(school.startsWith("school"));
		System.out.println(school.startsWith("t"));
		System.out.println();
		
		// .contains() (string) : boolean
		// check if string includes the given String or not
		
		System.out.println(school.contains("xo")); // false
		System.out.println(school.contains("circle")); // true
		System.out.println();
		
		// . substring() :string
		String str = "techcircle school";
		// one parameter (int)
		System.out.println(str.substring(11));
		// two parameter (int , int)
		// first is include, second is exclude
		System.out.println(str.substring(11,14)); // sch
		System.out.println(str.substring(5,16)); // ircle schoo
		System.out.println();
		
		
		// .replace() (string,string) :string
		System.out.println(str.replace('o','0'));
		System.out.println(str.replace("school","high school"));
		System.out.println();
		
		// .trim() :string
		// remove whitespace from front and back of the string
		String otherStr = "  hey, son   ";
		System.out.println(otherStr.trim());
		System.out.println();
		
		// no matter what you do with the string.
		// it will be immutable
//	      school = school.replace("c",""); <== this will modify the string then assign value back
//	      to the same string
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
