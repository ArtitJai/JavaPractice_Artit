package day46_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test_HashMap {

	public static void main(String[] args) {
		
//			  Key	 value
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		
		map.put(100,"Amit");
		map.put(101,"Vijay");
		map.put(102,"Rahul");
		
		
		Map<String, Long>phonebook = new HashMap<>();
		
		phonebook.put("TechCircle", 703981034L);
		phonebook.put("Luke", 123456789L);
		phonebook.put("Dekizugi", 8234357890L);
		
		System.out.println(phonebook.get("Luke"));
		phonebook.put("Doraemon", 4567890234L);
		
		System.out.println(phonebook.get("Doraemon"));
		
		System.out.println(map.get(101));
		map.put(100, "Shizuka");
		map.put(101, "Dorame");
		map.put(102, "Nobita");
		
		for(Map.Entry<Integer, String> a : map.entrySet()) {
			System.out.println(" Key = " + a.getKey() + " : value = " + a.getValue());
		}
				
		//Elements can traverse in any order
//		for(Map.Entry m:map.entrySet()){
//		System.out.println(m.getKey()+" "+m.getValue());
//		}
		
		Map<String, String>row1 = new HashMap<>();
		
		row1.put("FIRST_NAME", "Steven");
		row1.put("LAST_NAME", "King");
		row1.put("EMAIL", "kSteven");
		row1.put("SALARY", "17000");
		
		Map<String, String>row2 = new HashMap<>();
		
		row2.put("FIRST_NAME", "Neena");
		row2.put("LAST_NAME", "Kochhar");
		row2.put("EMAIL", "kochhar");
		row2.put("SALARY", "17000");
		
		Map<String, String>row3 = new HashMap<>();
		
		row3.put("FIRST_NAME", "Lex");
		row3.put("LAST_NAME", "De Haan");
		row3.put("EMAIL", "Dehaan");
		row3.put("SALARY", "17000");
		
		List<Map<String, String>>table = new ArrayList<>();
		table.add(row1);
		table.add(row2);
		table.add(row3);
		
		for(Map<String, String> a : table) {
			System.out.println(a.get("FIRST_NAME"));
			
			for(Map.Entry<String, String> b : a.entrySet()) {
				System.out.println(b.getKey() + " : " + b.getValue());
			}
			System.out.println("----------------------------------------");
		}

}
}
	
