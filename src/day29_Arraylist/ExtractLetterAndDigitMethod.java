package day29_Arraylist;

public class ExtractLetterAndDigitMethod {

public static void main(String[] args) {
        
        String str = "1abcd234efg567@#$@#$@#hi456";
        
        System.out.println(extractDigitFromAString(str)); // digits
        System.out.println(extractLettersFromAString(str));
        System.out.println(extractSpecialCharactersFromAString(str));
        
    }
    public static String extractDigitFromAString(String str) {
    		//String str = "1abcd234efg567@#$@#$@#hi456";
        
        
        char[] chars = str.toCharArray();
        
        String digits = "";

        for (char a : chars){
            
            //System.out.println(a);
            if (Character.isDigit(a)) {
                digits += a;
            }

            
        }
        
        return digits;

    }
    
    public static String extractLettersFromAString(String str) {

        char[] chars = str.toCharArray();
        
        String letters = "";
        
        for (char a : chars){

            if (Character.isLetter(a)) {
                letters += a;
            }

        }

        return letters;
    }
    
    public static String extractSpecialCharactersFromAString(String str) {

        char[] chars = str.toCharArray();
        String specialCharacters = "";
        
        for (char a : chars){

            if (!Character.isDigit(a) && !Character.isLetter(a)) {
                specialCharacters += a;
            }
            
        }
        
        return specialCharacters;
    }



}
