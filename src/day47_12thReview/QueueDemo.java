package day47_12thReview;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		// FIFO
		
		Queue<Integer>numOueue = new PriorityQueue<>();
		// Insert
		numOueue.add(1);
		numOueue.add(2);
		
		System.out.println(numOueue);
		numOueue.add(3);
		System.out.println(numOueue);
		
		numOueue.offer(4);
		numOueue.offer(5);
		System.out.println(numOueue);
		
		
		System.out.println("======================");
		// Remove
//		numOueue.clear();
		Integer f1 = numOueue.poll(); // Return null if it empty
		System.out.println(f1);
		System.out.println(numOueue);
		
		Integer f2 = numOueue.remove(); // Throw an some exception if it empty
		System.out.println(f2);
		System.out.println(numOueue);
		
		
		System.out.println("======================");
		// examine
		Integer e1 = numOueue.element();
		System.out.println(e1);
		System.out.println(numOueue);
		
		Integer peek = numOueue.peek();
		System.out.println(peek);
		System.out.println(numOueue);
		
	}

}
