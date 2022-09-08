package day36_inheritance.encapsulation_review;

public class TestStringMethod {

	public static void main(String[] args) {
		
//		 Conditions:
//             name can not be empty or blank
//             name can not contain any special characters other than space
//             name must start with letters
//             unit price can not be negative
//             quantity can not be negative
//             if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1
// 			   Add a constructor that allows user to set all the fields when the object is created.
//             (If the arguments not valid it should not be set to the instances)
		
		Item apple = new Item("Apple", 1.19, 2);
		
		Item iPhone = new Item("iPhone 13 Pro Max", 1_199, 10);
		
		System.out.println(apple.toString());
		System.out.println(iPhone.toString());
		
		Item random = new Item("iPhone 13 ***Pro", 1_199, 10);
		System.out.println(random.toString());
		
		
	}
	
//	accessModifiers returnType methodName (parameters) {
//		your reuseable code here
//	}
	
//	public boolean checkIfTheNameIsValid(String str) {
//		
//		boolean isNotEmpty = false;
//		
//		boolean hasSpecialCharacter = false;
//		
//		boolean startsWithLetter = false;
//		
//		if(str.length() > 0) {
//			isNotEmpty = true;
//		}
//		startsWithLetter = Character.isLetter(str.charAt(0));
//		
//		for(char c : str.toCharArray()) {
//			System.out.println(c);							
//			if(!Character.isDigit(c) && !Character.isLetter(c)) {
//				if(c != ' ') { // c != ' ' == !Character.isSpace(c)
//				hasSpecialCharacter = true;
//				}
//			}
//		}
//			return isNotEmpty && startsWithLetter && !hasSpecialCharacter;
			
			
}

