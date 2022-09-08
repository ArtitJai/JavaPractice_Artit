package day48_javaReview.olive_press;

import java.util.Collection;

public class Kalamata extends Olive implements Press{
	
	public Kalamata() {
//		super.set("Kalamata");
		super("Kalamata", "Red", 5);
	}

	@Override
	public int press(Collection<Olive> olives) {
		// TODO Auto-generated method stub
		return 0;
	}

}
