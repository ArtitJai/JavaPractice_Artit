package day22_HW;

public class Task03_Palindromes {

	public static void main(String[] args) {
		
//		3. write a program that can count how many palindromes in an array of string
//        Ex:
//            {"anna", "level", "Java"};
//            output:
//                2
		
		
		 String[] str = {"anna", "Level", "Java"};
         int count = 0;
         
         for (int i= 0 ; i < str.length; i++) {
             
             String reversed = "";
             
        for (int j = str[i].length()-1; j >= 0; j--) {
            
            reversed +=str[i].charAt(j);
        }
        if(reversed.equalsIgnoreCase(str[i])) {
            count++;
        }
         }
        System.out.println("The count of palindromeds in the array is " + count);
		
		
		
		
		
		

	}

}
