package day47_12thReview;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
// data structure that not specific to any language, use Key, Value pair
	public static void main(String[] args) {
		// in java, Map/HashMap is using HashTable data structure
		// python -> Dictionary
		// C# -> Dictionary
		// JavaScript -> Object
		
		List<Customer>customers = new ArrayList<>();
		for(Customer customer : customers) {
			if(customer.getEmail().equals("luke@abc.com")) {
				System.out.println("Found");
			}
		}
	}

}

class Customer{
	private String name;
	private String email;
	
	@Override
	public String toString() {
		return "name = " + name;
	}

	public String getEmail() {
		return email;
	}

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
}
