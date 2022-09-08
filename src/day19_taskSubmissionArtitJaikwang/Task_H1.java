package day19_taskSubmissionArtitJaikwang;

public class Task_H1 {

	public static void main(String[] args) {
//		
//		Task - H1
//
//		Given a string, return a string where every appearance of the lowercase word "is" 
//		has been replaced with "is not". 
//		The word "is" should not be immediately preceded or followed by a letter 
//		-- so for example the "is" in "this" does not count. (Note: Character.
//		isLetter(char) tests if a char is a letter.)
//
//
//		notReplace("is test") → "is not test"
//		notReplace("is-is") → "is not-is not"
//		notReplace("This is right") → "This is not right"
//		notReplace("") → ""
//		notReplace("is his") → "is not his"
		
		String str = "is-is";
		
		int a = str.indexOf("is"), check;
		
		while(a != -1) {
			check = 0;
			if(a > 0) {
				if(!Character.isLetter(str.charAt(a-1)))
					check++;
			}
			else
				check++;
			if(a < str.length()-2) {
				if(!Character.isLetter(str.charAt(a+2)))
					check++;
			}
			else
				check++;
			if(check == 2)
				str = str.substring(0,a) + "is not" + str.substring(a+2);
			a = str.indexOf("is", a + 2);
		}
		System.out.println(str);
			
		

	}

}
