package queue;

import java.util.ArrayDeque;
//import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {

//	Queue<Integer> queue = new LinkedList<Integer>(); //It can also be declared using LinkedList
	
	
	public static void printElementsOfQueue(Queue<Integer> queue) {
		Queue<Integer> helper = new ArrayDeque<Integer>();
//		for (Integer i : queue) {
//			System.out.print(i+" ");
//			helper.add(i);
//		}
		while(queue.size()>0) {
			System.out.print(queue.peek()+" ");
			helper.add(queue.poll());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(1); // Similar to push in stack
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
//		System.out.println(queue);
//		queue.remove(); // Removed in FIFO manner
//		System.out.println(queue);
//		queue.poll(); // Removal can also be done using poll
//		System.out.println(queue);
//		System.out.println(queue.peek()); // It shows the First Element
//		System.out.println(queue.element()); // It also shows the First Element
//		System.out.println(queue.size()); // It shows the size of the Queue
		QueueBasics.printElementsOfQueue(queue);
	}
}
