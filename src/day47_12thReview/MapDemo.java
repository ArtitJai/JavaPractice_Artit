package day47_12thReview;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Luke", "luke@abc.com");
		Customer c2 = new Customer("John", "john@abc.com");
		Map<String, Customer>customerMap = new HashMap<>();
//							Key		 , Value
		customerMap.put(c1.getEmail(), c1 );
		customerMap.put(c2.getEmail(), c2 );
		System.out.println(customerMap.size());
		
		Customer searchCustomer = customerMap.get("luke@abc.com");
		System.out.println(searchCustomer);
		
		

	}

}
