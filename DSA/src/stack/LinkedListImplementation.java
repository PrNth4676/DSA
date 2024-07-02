package stack;

public class LinkedListImplementation {

	static Node head = null;
	static int size = 0;

	public static void pushToStack(int element) {
		Node elToAdd = new Node(element);
		elToAdd.next = head;
		head = elToAdd;
	}

	public static int peekOfStack() {
		if (head == null) {
			System.out.println("Empty Stack!");
			return -1;
		} else {
			return head.value;
		}
	}

	public static int popStack() {
		int top = 0;
		if (head == null) {
			System.out.println("Empty Stack!");
			return -1;
		} else {
			top = head.value;
			head = head.next;
			return top;
		}
	}

	public static int sizeOfStack() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		count = size;
		return count;
	}

	public static void displayFromTop() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void printRecursive(Node head) {
		if (head == null)
			return; // BASE CONDITION
		printRecursive(head.next); // CALL
		System.out.print(head.value + " "); // TODO
	}

	public static void displayFromButtom() {
		printRecursive(head);
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListImplementation.pushToStack(10);
		LinkedListImplementation.pushToStack(20);
		LinkedListImplementation.pushToStack(30);
		System.out.println("Top Element : " + LinkedListImplementation.peekOfStack());
		LinkedListImplementation.displayFromTop();
		LinkedListImplementation.displayFromButtom();
		LinkedListImplementation.popStack();
		System.out.println("Top Element : " + LinkedListImplementation.peekOfStack());
		LinkedListImplementation.displayFromTop();
	}
}
