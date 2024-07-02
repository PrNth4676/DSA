package linkedListProblems;

public class FirstLinkedList {
	
	public static int lengthOfLL(Node head) {
		int count=0;
		Node temp;
		temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void traverse(Node head) {
		Node temp;
		temp = head;
		while (temp != null) { // Reaches the end/tail of the Linked List
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void traverseR(Node head) {
		if (head == null) //BASE Condition
			return;
		Node temp;
		temp = head;
		System.out.println(temp.data);
		traverseR(temp.next);
	}
	
	public void reverseTraverse(Node head) {
		if (head == null) //BASE Condition
			return;
		Node temp;
		temp = head;
		reverseTraverse(temp.next);
		System.out.println(temp.data);
	}
	
	public static void main(String[] args) {
		FirstLinkedList linkedList = new FirstLinkedList();
		Node node = new Node(5);
		Node node2 = new Node(10);
		Node node3 = new Node(15);
		Node node4 = new Node(20);
//		System.out.println(node.next);
		node.next = node2; // node->node2 and a Linked List is created
		node2.next = node3;
		node3.next = node4;
//		System.out.println(node.next.data); //Using the first node i.e., HEAD I can access the values of all other nodes in the Linked List
		linkedList.traverse(node);
//		linkedList.reverseTraverse(node);
		System.out.println("Length of the linked list is : "+FirstLinkedList.lengthOfLL(node));
	}
}
