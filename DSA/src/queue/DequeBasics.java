package queue;

import java.util.Deque;
import java.util.LinkedList;

//Double Ended Queue
public class DequeBasics {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<Integer>();
		// Add
		deque.addLast(1);
		deque.addLast(2);
		deque.addLast(3);
		System.out.println(deque);
		deque.addLast(5);
		deque.add(6); // This will also add values at the last like in Queue
		System.out.println(deque);

		// Get
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());

		// Remove
		deque.removeFirst();
		System.out.println(deque);
		deque.removeLast();
		System.out.println(deque);
		deque.remove(); // This will remove from the last like in Queue
		System.out.println(deque);

		deque.removeAll(deque); // This will remove all the elements in the Queue at once
		System.out.println(deque);

	}

}
