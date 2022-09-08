package day41_errorhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		
			Thread.sleep(1000);
			
			File file = new File("Location");
			
			FileReader fr = new FileReader(file);
		
		
	}

}
