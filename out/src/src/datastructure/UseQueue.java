package src.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<Integer> newQ = new LinkedList<Integer>();
		// Add elements to Queue.
		newQ.add(125);
		newQ.add(130);
		newQ.add(911);
		newQ.add(455);
		newQ.add(725);
		//Applied peek, poll, remove
		System.out.println(newQ.peek());
		System.out.println(newQ.poll());
		System.out.println(newQ.peek());
		System.out.println(newQ.remove());
		System.out.println(newQ.peek());

		//Use of For Each loop  to retrieve data.

		System.out.println("Use of for each loop to retrieve data: ");
		for (Integer in : newQ) {
			System.out.println(in);
		}

		//Use of while loop with Iterator to retrieve data.
		System.out.println("Use of while loop to retrieve data: ");
		Iterator itr = newQ.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
	}
}




























