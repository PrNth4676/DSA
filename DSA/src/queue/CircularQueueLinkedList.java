package queue;

public class CircularQueueLinkedList {

	static Node head = null;
	static Node tail = null;
	static int size = 0;

	public static void addElementsToQueue(int element) {
		Node temp = new Node(element);
		if (size == 0) {
			head = tail = temp;
			head.next = tail;
		} else {
			tail.next = temp;
			tail = temp;
			tail.next = head;
		}
		size++;
	}

	public static int peekElementFromQueue() throws Exception {
		if (size == 0) {
			throw new EmptyQueueException("Empty Queue in Peek Method!");
		} else {
			return head.value;
		}
	}

	public static int removeElementFromQueue() throws Exception {
		int result = 0;
		if (size == 0) {
			throw new EmptyQueueException("Empty Queue in Remove Method !");
		} else {
			result = head.value;
			head = head.next;
			tail.next = head;
		}
		size--;
		return result;
	}

	public static void displayElementsInQueue() throws Exception {
		Node temp = head;
		if (temp == null) {
			throw new EmptyQueueException("Empty Queue! in Display Method");
		} else {
			while (temp != tail) {
				System.out.print(temp.value + " ");
				temp = temp.next;
			}
			System.out.print(tail.value + " ");
		}
		System.out.println();
	}

	public static boolean isEmpty() {
		// Ternary operator - (condition) ? expression1 : expression2
		return ((size == 0) ? true : false);
	}

	public static void main(String[] args) {
		try {
			CircularQueueLinkedList.displayElementsInQueue();
			CircularQueueLinkedList.addElementsToQueue(10);
			CircularQueueLinkedList.addElementsToQueue(20);
			CircularQueueLinkedList.addElementsToQueue(30);
			CircularQueueLinkedList.displayElementsInQueue();
			CircularQueueLinkedList.removeElementFromQueue();
			CircularQueueLinkedList.displayElementsInQueue();
			CircularQueueLinkedList.addElementsToQueue(40);
			CircularQueueLinkedList.displayElementsInQueue();
		} catch (Exception e) {
			System.out.println("Exception Occurred : " + e);
		}
//		CircularQueueLinkedList.addElementsToQueue(10);
	}
}
