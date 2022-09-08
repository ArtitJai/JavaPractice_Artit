package day30_ArrayListReview;

public class PassWordHomeWork {

    public static boolean isStrongPassword(String password) {
        boolean has8Character = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;
        boolean hasSpace = false;
        
        if (password.length() >= 8) {
//              1.1 Password must be at least have 8 characters long
            has8Character = true;
        }
        for (char c : password.toCharArray()) {

//            1.2 PassWord should at least contain one upper case letter
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            
//            1.3 PassWord should at least contain one lower case letter
            if(Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
//            1.4 Password should at least contain one special characters
            
            if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
                hasSpecialChar = true;
            }
            
//            1.5 Password should at least contain a digit
            if(Character.isDigit(c)) {
                hasDigit = true;
            }
//            1.6 Should not contain space
            if(Character.isSpace(c)) {
                hasSpace = true;
            }
            
//            if(c == ' ') {
//                hasSpace = true;
//            }
            
        }

        return has8Character && hasUpperCase && hasLowerCase && !hasSpace && hasSpecialChar && hasDigit;
    }
}
