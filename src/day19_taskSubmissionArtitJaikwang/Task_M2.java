package day19_taskSubmissionArtitJaikwang;

public class Task_M2 {

	public static void main(String[] args) {
		
//		### Task - M2
//
//		A sandwich is two pieces of bread with something in between. Return the string that is between the
//		first and last appearance of "bread" in the given string, or return the empty string "" if there are
//		not two pieces of bread.
//
//		```text
//		getSandwich("breadjambread") → "jam"
//		getSandwich("xxbreadjambreadyy") → "jam"
//		getSandwich("xxbreadyy") → ""
		
		String str = "xxbreadjambreadyy";
		String between = "";
		int count = 0;
		
		for(int i = 0; i < str.length()-5; i++) {
			
		
			if(str.substring(i, i + 5).equals("bread")) {
				count++;
			}
		}	
		if(count >= 2) {
			between = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
		}
		else {
			between = "\"\"";
		}
		System.out.println(between);
	}

}
