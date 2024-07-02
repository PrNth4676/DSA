package queue;

public class QueueArrayImplementation {

	static int front = -1;
	static int rear = -1;
	static int size = 0;
	static int[] arr = new int[100];

	public static void addElementsToQueue(int element) {
		if (rear == (arr.length - 1)) {
			System.out.println("Queue is full");
			return;
		}
		//Base Condition - first element addition to Queue
		if (front == -1) {
			front = rear = 0;
			arr[0] = element;
			// Enter value at (r+1)th index
		} else {
			arr[rear + 1] = element;
			rear++;
			// The two lines can also be written as, arr[++rear]=element;
		}
		size++;
	}

	public static int removeElementsFromQueue() {
		if (size == 0) {
			System.out.println("Queue is empty!");
			return -1;
		}
		int removedElement = arr[front]; // Remove the front element
		front++; // Move the front to the next element which will be the new front now
		size--;
		return removedElement;
	}

	public static int peekElementsFromQueue() {
		if (size == 0) {
			System.out.println("Queue is empty!");
			return -1;
		}
		int removedElement = arr[front];
		return removedElement;
	}

	public static boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void displayElementsOfQueue() {
		if (size == 0) {
			System.out.println("Empty Queue");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		QueueArrayImplementation.addElementsToQueue(10);
		QueueArrayImplementation.addElementsToQueue(20);
		QueueArrayImplementation.addElementsToQueue(30);
		QueueArrayImplementation.displayElementsOfQueue();
		QueueArrayImplementation.removeElementsFromQueue();
		QueueArrayImplementation.displayElementsOfQueue();
	}
}
