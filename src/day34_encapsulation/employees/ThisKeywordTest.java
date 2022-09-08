package day34_encapsulation.employees;

public class ThisKeywordTest {

	public static void main(String[] args) {
		
		ThisKeyword aj = new ThisKeyword();
		aj.readValue();
		System.out.println();
		
		
		ThisKeyword dekizugi = new ThisKeyword("dekizugi", 26, "345-34-3455");
		dekizugi.readValue();
		System.out.println();
		
		dekizugi.Jane();
		dekizugi.readValue();

	}

}
