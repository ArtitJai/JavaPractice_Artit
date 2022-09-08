package day40_interface_abstract.cars;

public class CarMax {

	public static void main(String[] args) {
		
		// You can't create instance of abstract class.
//		 Car c = new Car();
		Car pilot = new Honda("Pilot", "White", 2022, 45000); // Parameterized constructor of the Honda Class
		
		Car modelX = new Tesla(); // Default constructor of the Tesla class
		modelX.setColor("Red");
		modelX.setPrice(120000);
		modelX.setModel("Model X");
		modelX.setYear(2021);
//		modelX.setBrand("Tesla");
		
		Car q5 = new Audi("Q5", "Silver", 2019, 35000);
		
		Car[] cars = {pilot, q5, modelX};	
		
//		String[] names = new String[4];
		
		double total = 0;
		
		for(int i = 0; i < cars.length; i++) {
			cars[i].start();
			
			total += cars[i].getPrice();
			
			System.out.println(cars[i].toString());
		}
		
		System.out.println();
		System.out.println(total);

	}

}
