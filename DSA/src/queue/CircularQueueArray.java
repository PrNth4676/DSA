package queue;

public class CircularQueueArray {

	static int front = -1;
	static int rear = -1;
	static int size = 0;
	static int[] arr = new int[5];
	static int l = arr.length;

	public static void addElementsToQueue(int element) throws Exception {
		// Base Condition - first element addition to Queue when its empty
		if (size == l) {
			throw new Exception("Queue is full"); // This will throw an Exception which will be printed
		} else if (size == 0) {
			front = rear = 0;
			arr[0] = element;
		} else if (rear < l - 1) {
			arr[rear + 1] = element;
			rear++;
		} else if (rear == l - 1) {
			rear = 0;
			arr[rear] = element;
		}
		size++;
	}

	public static int removeElementsFromQueue() throws Exception {
		int removedElement = 0;
		if (size == 0) {
			throw new Exception("Queue is empty!");
		} else {
			removedElement = arr[front]; // Remove the front element
			if (front == l - 1) {
				front = 0;
				size--;
				return removedElement;
			} else {
				front++; // Move the front to the next element which will be the new front now
				size--;
				return removedElement;
			}
		}
	}

	public static int peekElementsFromQueue() throws Exception {
		if (size == 0) {
			throw new Exception("Queue is empty!");
		}
		return arr[front];
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
			if (front <= rear) {
				for (int i = front; i <= rear; i++) {
					System.out.print(arr[i] + " ");
				}
			} else {
				for (int i = 0; i <= rear; i++) {
					System.out.print(arr[i] + " ");
				}
				for (int i = front; i < l; i++) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		CircularQueueArray.displayElementsOfQueue();
		CircularQueueArray.addElementsToQueue(10);
		CircularQueueArray.addElementsToQueue(20);
		CircularQueueArray.addElementsToQueue(30);
		CircularQueueArray.addElementsToQueue(40);
		CircularQueueArray.addElementsToQueue(50);
		CircularQueueArray.displayElementsOfQueue();
		CircularQueueArray.removeElementsFromQueue();
		CircularQueueArray.displayElementsOfQueue();
		CircularQueueArray.addElementsToQueue(60);
		CircularQueueArray.displayElementsOfQueue();
		CircularQueueArray.removeElementsFromQueue();
		CircularQueueArray.displayElementsOfQueue();
		CircularQueueArray.addElementsToQueue(70);
		CircularQueueArray.displayElementsOfQueue();
	}
}
