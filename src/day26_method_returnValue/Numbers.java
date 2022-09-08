package day26_method_returnValue;

public class Numbers {

	public static void main(String[] args) {
	
		
		System.out.println(maxnum(1,2));
		System.out.println(maxnum(10,2));
		System.out.println(maxnum1(5,15));

	}

	public static int maxnum(int a, int b) {
		
		return a > b ? a : b;
	}
	
public static int maxnum1(int a, int b) {
		
		int max = a;
		
		if (a > b) {
			max = a;
		}else {
			max = b;
		}
		
		return max;
}
}
	

