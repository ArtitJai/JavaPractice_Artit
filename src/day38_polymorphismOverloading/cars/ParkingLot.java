package day38_polymorphismOverloading.cars;

public class ParkingLot {

	public static void main(String[] args) {
		
		Car c = new Toyota("Camry", 2022, 23000, "Silver", 7000);
		
		c.start();
		c.drive();
		System.out.println(c.toString());
		
		System.out.println();
		
		BMW z8 = new BMW("Z8", 2020, 300000, "Red", 20000);
		z8.breaksDown();
		z8.racing();
		
		System.out.println();
		
		Car x5 = new BMW("X5", 2022, 70000, "Black", 3000);
//		x5.racing(); -> can't call it cuz your parent class doesn't have racing method
		
		x5.drive();
		x5.start();
		System.out.println(x5.toString());

	}

}
