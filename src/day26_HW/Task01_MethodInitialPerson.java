package day26_HW;

public class Task01_MethodInitialPerson {
	
//	1. Create a method that can display the initials of the person
	
	private static void initial(String names) {
		
		 if (names.length() == 0)
			 return;
	 
	        System.out.print(Character.toUpperCase(
	            names.charAt(0)));
	        
	        for (int i = 1; i < names.length() - 1; i++)
	            if (names.charAt(i) == ' ')
	                System.out.print(" " + Character.toUpperCase(
	                                        names.charAt(i + 1)));
	    }
		
	
	public static void main(String[] args) {
		
		String names = "artit jaikwang";
        initial(names);
		
		
	}

}
