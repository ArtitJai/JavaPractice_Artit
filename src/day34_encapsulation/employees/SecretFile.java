package day34_encapsulation.employees;

public class SecretFile {
	
	private String db_connection;
	private String userName;
	private String password;
	
	public SecretFile() {
		setDb_connection("oracle-aws-123.123.123");
		setUserName("admin");
		setPassword("abc123");
	}
	
	// reading value
	public String getDb_connection() {
		return db_connection;
	}
	
	// update value of the db_connection variable
	public void setDb_connection(String value) {
		db_connection = value;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
