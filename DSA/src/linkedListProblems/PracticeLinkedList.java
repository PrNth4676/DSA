package linkedListProblems;

public class PracticeLinkedList {
	static Node head;

	public static void traverse(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void traverseR(Node head) {
		if (head == null)
			return; // BASE CONDITION
		System.out.print(head.data + " "); // TODO
		traverseR(head.next); // CALL
	}

	public static void reverseLL(Node head) {
		if (head == null)
			return;
		reverseLL(head.next);
		System.out.print(head.data + " ");
	}

	public static void insertAtHead(int val) {
		Node node = new Node(val);
		if (head == null) {
			node = head;
		} else {
			node.next = head;
		}
		node = head;
	}

	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
//		PracticeLinkedList.traverse(a);
//		PracticeLinkedList.traverseR(a);
		PracticeLinkedList.reverseLL(a);
	}
}
