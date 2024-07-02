package queue;

public class QueueLinkedList {

	static Node head = null;
	static Node tail = null;
	static int size = 0;

	public static void addElementsToQueue(int element) {
		Node temp = new Node(element);
		if (size == 0) {
			head = tail = temp; // Making the first element entry as head and tail
		} else {
			tail.next = temp; // FIFO
			tail = temp;
		}
		size++;
	}

	public static int peekElementFromQueue() {
		if (size == 0) {
			System.out.println("Empty Queue!");
			return -1;
		}
		return head.value;
	}

	public static int removeElementFromQueue() {
		int result = 0;
		if (size == 0) {
			System.out.println("Empty Queue!");
			return -1;
		}
		result = head.value;
		head = head.next;
		size--;
		return result;
	}

	public static void displayElementsInQueue() {
		Node temp = head;
		if (size == 0) {
			System.out.println("Empty Queue!!");
		} else {
			while (temp != null) {
				System.out.print(temp.value + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		QueueLinkedList.displayElementsInQueue();
		QueueLinkedList.addElementsToQueue(10);
		QueueLinkedList.addElementsToQueue(20);
		QueueLinkedList.addElementsToQueue(30);
		QueueLinkedList.displayElementsInQueue();
		QueueLinkedList.removeElementFromQueue();
		QueueLinkedList.displayElementsInQueue();
	}
}
