package day25_method;

public class PlayingWithNumber {

	public static void printOddNumbers(int num) {
		
//		int num = 50;
		for (int i = 0; i <= num; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	public static void printFullName(String firstName, String lastName) {
		String fullName = firstName.concat(" ").concat(lastName);
		
		System.out.println(fullName);
	}
	public static void main(String[] args) {
		
		printOddNumbers(10);
		
		printOddNumbers(100);
		
		String firstName = "Luke";
		String lastName = "Skywalker";
		
//		String fullName = firstName.concat(" ").concat(lastName);
//		
//		System.out.println(fullName);
		
		printFullName(firstName,lastName);
		
		String[] firstNameList = {"Luke", "John", "Jane", "Bob", "Steve"};
		String[] lastNameList = {"Skywalker", "Doe", "Doe", "Evans", "Mckoy"};
		
		for(int i = 0; i < firstNameList.length; i++) {
//			System.out.println(i);
			printFullName(firstNameList[i], lastNameList[i].toUpperCase());
		}
		
	}

}
