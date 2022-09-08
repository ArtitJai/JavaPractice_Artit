package day43_11thReview.inclass.ExceptionDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionDemo {
	// Handle Exception
	// - try-catch block
	public static void main(String[] args) {

//		sayTheWord("Hello World");
		
		try {
		FileReader reader = new FileReader("Users/Mojinoom/eclipse-workspace/cohort11-java_Artit/src/day43_11thReview/inclass");
		Scanner sc = new Scanner(reader);
		while(sc.hasNext());{
			System.out.println(sc.nextLine());
		}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================");
		System.out.println("Complete reading file");
		
	}
	
	public static void sayTheWord(String word) { // this will run forever
		System.out.println("Hey " + word);
		sayTheWord(word);
		
	}
	
	public void waitFor(int millisecond) throws InterruptedException {
		Thread.sleep(millisecond);
		Thread.sleep(5);
		System.out.println("yoooooooo!");
	}
}
