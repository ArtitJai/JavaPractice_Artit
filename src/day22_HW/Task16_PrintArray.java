package day22_HW;

public class Task16_PrintArray {

	public static void main(String[] args) {
		
		
//			Given the Array:
//			String[][]items={
//			   {"Apple","Banana","Grape","Avocado"},
//			   {"Paper Towels","Toilet Papers","Tissues","Diapers"},
//			   {"Coke","Fanta","Arizona Tea","Pepsi","Water"}
//			   };
//			print the following output: (add \t between two words)
//			Apple           Banana          Grape           Avocado
//			Paper Towels    Toilet Papers   Tissues         Diapers
//			Coke            Fanta           Arizona Tea     Pepsi           Water
//			print the following output: (add \t between two words)
//			Avocado         Grape           Banana          Apple
//			Diapers         Tissues         Toilet Papers   Paper Towels
//			Water           Pepsi           Arizona Tea     Fanta           Coke
//			print the following output: (add \t between two words)
//			Coke            Fanta           Arizona Tea     Pepsi           Water
//			Paper Towels    Toilet Papers   Tissues         Diapers
//			Apple           Banana          Grape           Avocado

		
				String[][]items={
				   {"Apple","Banana","Grape","Avocado"},
				   {"Paper Towels","Toilet Papers","Tissues","Diapers"},
				   {"Coke","Fanta","Arizona Tea","Pepsi","Water"}
				   };
		
//				print the following output: (add \t between two words)
//				Apple           Banana          Grape           Avocado
//				Paper Towels    Toilet Papers   Tissues         Diapers
//				Coke            Fanta           Arizona Tea     Pepsi           Water			
				
				for(int i = 0;  i < items.length; i++) {
					for(int j = 0; j < items[i].length; j++) {
						System.out.print("\t" + items[i][j] + "\t");
					}
					System.out.println();
				}
				
			System.out.println("\n--------------------------------PART-1-------------------------------------------\n");
			
//			print the following output: (add \t between two words)
//			Avocado         Grape           Banana          Apple
//			Diapers         Tissues         Toilet Papers   Paper Towels
//			Water           Pepsi           Arizona Tea     Fanta           Coke
			
			for(int i = 0; i < items.length; i++) {
				for(int j = items[i].length - 1; j >= 0; j--) {
					System.out.print("\t" + items[i][j] + "\t");
				}
				System.out.println();
			}
		
			System.out.println("\n--------------------------------PART-2-------------------------------------------\n");
		
//			print the following output: (add \t between two words)
//			Coke            Fanta           Arizona Tea     Pepsi           Water
//			Paper Towels    Toilet Papers   Tissues         Diapers
//			Apple           Banana          Grape           Avocado
			
			for(int i = items.length - 1; i>= 0; i--) {
				for(int j = 0; j < items[i].length; j++) {
					System.out.print("\t" + items[i][j] + "\t");
				}
				System.out.println();
			}
			
			System.out.println("\n--------------------------------PART-3-------------------------------------------\n");
	}

}
