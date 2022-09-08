package day41_errorhandling;

import java.io.File;
import java.io.FileReader;

public class CheckedExceptions {

	public static void main(String[] args) {
		
//		Checked Exception ==> compile time exception
		
		
		try {
			
		System.out.println("Waiting for 1 second");
		Thread.sleep(2000);
		System.out.println("Waiting for 1 second");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		File file = new File("c:/user/test");
		
		try {
		FileReader fr = new FileReader(file);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
