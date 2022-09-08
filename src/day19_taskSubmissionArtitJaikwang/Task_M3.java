package day19_taskSubmissionArtitJaikwang;

public class Task_M3 {

	public static void main(String[] args) {
		
//		Given a string and a non-empty word string, return a version of the original String where all chars
//		have been replaced by pluses ("+"), except for appearances of the word string which are preserved
//		unchanged.
//
//				```text
//				plusOut("12xy34", "xy") → "++xy++"
//				plusOut("12xy34", "1") → "1+++++"
//				plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
		
		String str = "12xy34xyabcxy";
		String word = "xy";
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if( i <= str.length() - word.length()) {
				String str1 = str.substring(i, i + word.length());
				if(str1.equals(word)) {
					result += word;
					i += word.length() - 1;
				}
				else
					result += "+";
			}
			else
				result += "+";
		}
		
		System.out.println(result);
		
	}

}
