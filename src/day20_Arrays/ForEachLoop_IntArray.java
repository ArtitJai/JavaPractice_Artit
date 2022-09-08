package day20_Arrays;

public class ForEachLoop_IntArray {

	public static void main(String[] args) {
		
		int []num = {2, 3, 4, 5};
		
		for(int i : num) {
			System.out.println(i);
		}
		
		for(int i : num) {
			System.out.println(num[3]);
		}

	}

}
