package day20_Arrays;

public class StringArrays {

	public static void main(String[] args) {
		
		  String city[] = {"Madrid","Barcelona","London"};
	        
	        for(int i = 0; i < city.length; i++) {
	            System.out.println(city[i]);
	        }
	        
	        String cities[] = new String[3];
	        
	        cities[0] = "Madrid";
	        cities[1] = "barcelona";
	        cities[2] = "London";
	        
	        System.out.println("Our first city" + cities[0]);
	        System.out.println("Our second city" + cities[1]);
	        System.out.println("Our third city" + cities[2]);
	        
	        for(int i = 0; i < cities.length; i++) {
	            System.out.println(cities[i]);
	        }
	}

}
