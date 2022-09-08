package day41_errorhandling;

public class StringIndexProblem {

	public static void main(String[] args) {
		
		try {
		String name = "TechCircle";
		
		for(int i = 0; i <= name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		}catch(Exception e) {
//			System.out.println("Catch Error");
//			e.printStackTrace();
		}
	}

}
