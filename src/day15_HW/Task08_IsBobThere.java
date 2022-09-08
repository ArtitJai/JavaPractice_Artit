package day15_HW;

public class Task08_IsBobThere {

	public static void main(String[] args) {
		
		/*## Task - Is Bob There
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

```text
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
*/ 

		String str = "gukhkjlbjb";
		
		 int i = str.indexOf('b'); 
		
//		boolean bob = str.charAt(i) == 'b' && str.charAt(i + 2) == 'b' == true;
		
		
			if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				System.out.println(true);
			
		}else {
			System.out.println(false);	
		}

	}
}
			
			
			
			
			
		

