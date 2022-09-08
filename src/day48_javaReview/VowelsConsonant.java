package day48_javaReview;

public class VowelsConsonant {

	public static void main(String[] args) {
		  String str = "TechCircle";
		   
		  int vCount = 0, cCount = 0;
		   str = str.toLowerCase();
		   
		   for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vCount++;
			}
			  else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') { 
				  cCount++;
			  }
		}
		   
				   System.out.println("Vowel: " + vCount); 
				   System.out.println("Consonant: " + cCount); 
				   
			int vow = 0;
			int conso = 0;
			
			String vowel = "aeiou";
			
			for (int i = 0; i < str.length(); i++) {
	            if (!vowel.contains(str.charAt(i)+"")) {
	                conso++;
	            } else {
	                vow++;
	            }
	        }
	        System.out.println("vowels : " + vow);
	        System.out.println("consonant : " + conso);
				    
		   }

	}


