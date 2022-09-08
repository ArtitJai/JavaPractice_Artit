package day34_HW_class_constructor.sub;

import day34_HW_class_constructor.Offer;

public class Task02_Offer {

	public static void main(String[] args) {
		
	Offer offe = new Offer();
	offe.setInfo("FairFax", "Amazon", "Cyber Security", 140000, true, true, true, true);
	System.out.println(offe.toString());
	}

}
