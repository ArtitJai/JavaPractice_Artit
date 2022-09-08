package day22_ArrayOfArray;

public class Task1_ClassmateName {

	public static void main(String[] args) {
		/*
		 * Create an array named classmates, and store 10 of your classmates' full names
		 * 	print the initials of each classmates in separate lines
		 */

	String[] names = {"John Doe", "Jane Doe", "Luke Skywalker", "Thom Browne", "Luke Skywalker", "Paul Walker", "Jake Blake", "Julie Dough", "Chelsea Kahn", "Olivia Wang"};
	
	for(int i = 0; i < names.length ; i++) {
		System.out.println(names[i]);
		
		String firstname = names[i].split(" ")[0];
		String lastname = names[i].split(" ")[1];
		String initial = "";
		initial += firstname.charAt(0);
		initial += lastname.charAt(0);
		
		System.out.println(initial);
	}
	

	
	
	
	
	
	}

}
