package day41_errorhandling;

public class MultiCatchBlock {

	public static void main(String[] args) {
		
		
		String name = null;
		try {
		System.out.println(name.charAt(0));
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}catch(Throwable e) {
			e.printStackTrace();
		}finally{
			System.out.println("Clean up code here");
			System.out.println("Close your browser");
			System.out.println("Close your database connection");
		}
		
		System.out.println("I'm here");
	}

}
