package day22_HW;

public class Task05_ShoppingItem {

	public static void main(String[] args) {
		
//		
//			Given the following arrays:
//			String[] items = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" }; 
//			double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}; 
//			int[] itemIDs = {12345 , 12346, 12347, 12348, 12349, 12350};
//			find out the first index number of "Gloves"
//			find out if "iPad" is contained in the item list
//			Print the report of each shopping item name - price - #ID
		
		String[]items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[]prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[]itemIDs = {12345 , 12346, 12347, 12348, 12349, 12350};
      
        System.out.println("--------------Part-1-------------------");
        
            for(int i = 0; i < items.length; i++) {
                if(items[i].equalsIgnoreCase("Gloves")) {
                    
                	System.out.println("The first index of 'Glove' is: "+i);
                    break;
                }
            }
            
            System.out.println();
            System.out.println("--------------Part-2-------------------");
            
            for(int j = 0; j < items.length; j++) {
                if(items[j].equalsIgnoreCase("iPad")) {
                    System.out.println("iPad is contained in the item lists");
                    
                }else {
                    System.out.println("iPad is NOT contained in the item lists");
                    break;
                }
            }
            System.out.println();
            System.out.println("--------------Part-3---------------------");
            
            for(int k = 0; k < items.length; k++) {
                System.out.println("Items:"+items[k]+" Price:"+prices[k]+ " ItemIDs:"+itemIDs[k]);
                
            }
                


	}

}
