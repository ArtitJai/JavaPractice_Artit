package day26_HW;

public class Task06_RemoveDuplicate {

		
//		6. create a method that can remove duplicated characters from a string and returns the new value
//							"aaabbcccc" ===> "abc"

	private static String output(String str) {
		
		
		String output = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(!output.contains(str.substring(i,i+1))) {
				output += str.charAt(i);	
			}
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(output("aaabbccccefggggg"));
	}
}
