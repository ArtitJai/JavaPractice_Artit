package day34_encapsulation.employees;

public class DatabaseConnection {

	public static void main(String[] args) {
		
		SecretFile sf = new SecretFile();
		
		System.out.println(sf.getUserName());
		System.out.println(sf.getPassword());
		System.out.println(sf.getDb_connection());
		
		System.out.println();
		
		sf.setDb_connection("training-oracle-aws321.321.321");
		sf.setUserName("admin2");
		sf.setPassword("password321");
		
		System.out.println(sf.getUserName());
		System.out.println(sf.getPassword());
		System.out.println(sf.getDb_connection());
		
		
	}

}
