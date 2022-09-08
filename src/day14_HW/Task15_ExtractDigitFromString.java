package day14_HW;

public class Task15_ExtractDigitFromString {

	public static void main(String[] args) {
		
		
		/* ## Task15
		`
		Write a program to extract digits from a String:
		     input: ab123c4d56efg
		     output:123456
		     */
		
		String a = "ab123c4d56efg";
		
        String num = "[^\\d+]";  // if does not have " ^ " your will get just alphabet

        String[] str = a.split(num);
       
        for(String str1: str){
            System.out.print(str1);
        }

	}

}



/*
. symbol matches any character except newline.
* repeats the character behind it 0 or more times.
\d matches any digit. The extra \ in \\d is used to escape the backslash from the string.
So .\\d. matches any single character, a digit, and any single character. It will match the following: a1b, p3k, &2@

.*\\d.* matches 0 or more characters, a digit, and 0 or more characters. It will match the following: 2, 11, 123, asdf6klj

If you want to match 1 or more characters you can use +, {2,}, {3,5}, etc.

+ means repeat previous character 1 or more times.

{2, } means repeat previous character two or more times.

{3, 5} means repeat previous character 3 to 5 times.
*/

