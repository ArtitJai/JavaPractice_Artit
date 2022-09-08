package day20_Arrays;

public class SubStringReview {

	public static void main(String[] args) {
		
		String str = "TechCircle";
		
		char chars[] = str.toCharArray();
		
		for(char eachChar : chars) {
			if(eachChar == 'T') {
				System.out.println(str.replace(eachChar,' '));
			}
			System.out.println(eachChar);
		}

	}

}
