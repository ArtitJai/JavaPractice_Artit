package day20_Arrays;

public class ForEachLoop_StringArray {

	public static void main(String[] args) {
		
		String city[] = {"Madrid","Barcelona","London"};
		
		for(String i : city) {
			System.out.println(i);
		}
		
		for(String i : city) {
			System.out.println(city[1]);
		}
		
		for(String eachItem : city) {
			System.out.println(eachItem);
		}
	}

}
