package day22_ArrayOfArray;

public class NumberOfSentence {

	public static void main(String[] args) {
		
		String str = "Hello my name is Artit. We are learning at Techcircle";
		
		String arr[] = str.split("\\.");
		
		System.out.println(arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		String s = "30 Days of React challenge is a step by step guide to learn React in 30 days. It requires HTML, CSS, and JavaScript knowledge. You should be comfortable with JavaScript before you start to React. If you are not comfortable with JavaScript check out 30DaysOfJavaScript. ";

        String arr1[]= s.split("[.]");
        System.out.println(arr1.length);
        System.out.println(arr1[0]);

	}

}
