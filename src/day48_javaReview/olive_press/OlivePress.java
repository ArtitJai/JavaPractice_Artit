package day48_javaReview.olive_press;

import java.util.Collection;

public class OlivePress implements Press{
	
	int total = 0;
	
	public int press(Collection<Olive>olives) {
		for(Olive o : olives) {
			System.out.println(o.toString());
			total += o.getOil();
		}
		
		return total;
	}

}
