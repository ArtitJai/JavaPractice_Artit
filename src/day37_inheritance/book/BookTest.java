package day37_inheritance.book;

public class BookTest {

	public static void main(String[] args) {
		
		DigitalBook pdf = new DigitalBook();
		
		pdf.read();
		
		pdf.printInfo();
		
		AudioBook the10Xrule = new AudioBook("Grant Cardon", "self Development", "Grant cardon", 0.0, 4, "Grant Cardon");
        
        the10Xrule.listen();
        
        System.out.println(the10Xrule.toString());
        
        PaperBook atomicHabit = new PaperBook("Atomic Habit", "SelfDevelopment", "Grant Cardone", 21.00,350);
        
        atomicHabit.read();
        
        System.out.println(atomicHabit.toString());

	}

}
