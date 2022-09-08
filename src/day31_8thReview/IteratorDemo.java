package day31_8thReview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		 
		List<String> cars = new ArrayList<>();
		cars.addAll(List.of("Ford", "Tesla", "Honda", "Volkswagen"));
		
		cars.forEach(car -> System.out.println(car));
		
		System.out.println();
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		System.out.println();
		
		// "Ford", "Tesla", "Honda"
		// ^
		Iterator<String> it = cars.iterator();
		String car1 = it.next();
		System.out.println(car1); // Ford
		System.out.println(it.next()); // Tesla
		
		System.out.println();
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		do {
			System.out.println(it.next());
		}
		while(it.hasNext()); 

	}

}
