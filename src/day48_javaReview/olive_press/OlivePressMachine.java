package day48_javaReview.olive_press;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class OlivePressMachine {

	public static void main(String[] args) {
		
		Olive olive1 = new Olive(); // instantiation
		
		olive1.set("Kalamata");
		olive1.setColor("Red");
		olive1.setOil(5);
		
		System.out.println(olive1.toString());
		
		Olive olive2 = new Kalamata();
		olive2.setOil(10);
		
		System.out.println(olive2.getColor());
		System.out.println(olive2.getName());
		System.out.println(olive2.getOil());

		Olive olive3 = new Olive(); 
		
		olive3.set("Ligurian");
		olive3.setColor("Green");
		olive3.setOil(3);
		
		Olive olive4 = new Olive(); 
		
		olive4.set("Ligurian");
		olive4.setColor("Green");
		olive4.setOil(4);
		
		Olive olive5 = new Olive(); 
		
		olive5.set("Ligurian");
		olive5.setColor("Green");
		olive5.setOil(6);
		
		OlivePress list = new OlivePress();
		
		Collection<Olive>olives = new ArrayList<>();
		
		olives.addAll(Arrays.asList(olive1, olive2, olive3, olive4));
		olives.add(olive5);
		olives.add(new Kalamata());
		
		olives.add(new Olive("Zeytun", "Black", 3));
		
		int total = list.press(olives);
//		for(Olive o : olives) {
//			System.out.println(o.toString());
//			total += o.getOil();
//		}
		
		System.out.println("Total oil: " + total);
		
		
	}

}
