package linkedListProblems;

public class LinkedList {
	static Node head; // It refers to the first node
	static Node tail = null; // It refers to the last node

	public static void traverse() {
		Node temp;
		temp = head;
		while (temp != null) { // Reaches the end/tail of the Linked List
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void traverseRecursion(Node head) {
		if (head == null)
			return;
		System.out.println(head.data);
		traverseRecursion(head.next);
	}

	public static int sizeOfLL() {
		Node temp;
		temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void insertAtHead(int value) {
		Node temp = new Node(value);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head; // Here, temp is connected to head and linked-listed
		}
		head = temp; // Here, the new value added is made HEAD
	}

	public static void insertAtEnd(int value) {
		Node temp = new Node(value);
		if (head == null) {
			head = temp;
		} else {
			tail.next = temp; // Here, tail is connected to temp and linked-listed
		}
		tail = temp; // Here, the new value to be added is made tail
	}

	public static void insertAtIndex(int value, int index) {
		Node t = new Node(value); // Creating a new node for the value passed
		Node temp = head; // temp will be used to iterate to the index-1
		if (index == sizeOfLL()) {
			insertAtEnd(value);
			return;
		} else if (index == 0) {
			insertAtHead(value);
			return;
		} else if (index < 0 || index > sizeOfLL()) {
			System.out.println("Invalid Index");
			return;
		}
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		t.next = temp.next;// This will cause the new node's pointing to temp.next
		temp.next = t;
	}

	public static int sumOfLinkedList() {
		Node temp;
		temp = head;
		int sum = 0;
		while (temp != null) {
			sum += temp.data;
			temp = temp.next;
		}
		return sum;
	}

	public static int searchElementInLL(int index) {
		Node temp = head;
		if (index < 0 || index > sizeOfLL()) {
			System.out.println("Invalid Index and hence no value is found");
			return -1;
		}
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public static void deleteAtIndex(int index) {
		if (index == 0) {
			head = head.next; // It moves the head to index 1 from 0
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next; // Move till the index-1 to be deleted
		}
		temp.next = temp.next.next;
		tail = temp; // This will cause the temp to be tail, which will be useful when we delete the
						// last index
	}

	public static Node getNodeFromEnd(Node head, int index) {
		int size = 0;
		Node temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		int a = size - index + 1; // ath node from start
		temp = head; // Re-initialising the temp to head.
		for (int i = 1; i < a; i++) {
			temp = temp.next; // Iterate to that index
		}
		return temp;
	}

	public static Node getNodeFromEndOneTraversal(Node head, int index) {
		Node slow = head;
		Node fast = head;
		for (int i = 1; i <= index; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static Node removeNodeFromEndOneTraversal(Node head, int index) {
		Node slow = head;
		Node fast = head;
		if (index == sizeOfLL()) {
			head = head.next;
			return head;
		}
		for (int i = 1; i <= index; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		slow = tail;
		return head;
	}

	public static int getMaximumValueInNode(Node head) {
		Node temp = head;
		int max = head.data;
		while (temp != null) {
			if (temp.data > max) {
				max = temp.data;
			}
			temp = temp.next;
		}
		return max;
	}

	// To find the middle in case of odd nodes and right-middle in case of even
	// nodes
	public static Node findRightMiddleNode(Node head) {
		Node slow = head;
		Node fast = head;
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		if (size % 2 == 0) {
			// Even no of nodes and we will fetch the right-middle node
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		} else {
			// Odd no of nodes and we will fetch the middle node
			while (fast.next != null && fast != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return slow;
	}

	// To find the middle in case of odd nodes and left-middle in case of even nodes
	public static Node findLeftMiddleNode(Node head) {
		Node slow = head;
		Node fast = head;
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		if (size % 2 == 0) {
			// Even no of nodes and we will fetch the left-middle node
			while (fast != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		} else {
			// Odd no of nodes and we will fetch the middle node
			while (fast.next != null && fast != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return slow;
	}

	// To delete the middle element in case of Odd and right-middle element in case
	// of Even Linked List
	public static Node deleteRightMiddleNode(Node head) {
		if (head.next == null) {
			return null;
		}
		Node slow = head;
		Node fast = head;
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		if (size % 2 != 0) {
			while (fast.next.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		} else {
			while (fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		slow.next = slow.next.next;
		return head;
	}

	public static void displayReverseUsingRecursion(Node head) {
		Node temp = head;
		if (temp.next == null) // BASE CONDITION
			return;
//		System.out.println(temp.data);
		displayReverseUsingRecursion(temp.next); // CALL
		// To print in Reverse
		System.out.println(temp.data); // TODO
	}

	public static void displayUsingRecursion(Node head) {
		Node temp = head;
		if (temp.next == null) // BASE CONDITION
			return;
		System.out.println(temp.data); // TODO
		displayUsingRecursion(temp.next); // CALL
	}

	// Reverse a Linked List using Recursion
	// Time Complexity : O(n)
	// Space Complexity : O(n)
	public static Node reverseLinkedListR(Node head) {
		Node temp = head;
		if (temp.next == null) // BASE CONDITION
			return head;
		Node newHead = reverseLinkedListR(temp.next); // CALL
		temp.next.next = head; // TODO - Interchanging the pointing
		temp.next = null;
		return newHead;
	}

	// Reverse a Linked List
	public static Node reverseLinkedList(Node head) {
		Node before = head;
		Node current = null;
		Node after = null;
		while (current != null) {
			after = current.next;
			current.next = before;
			before = current;
			current = after;
		}
		return before;
	}

	// Check if a Linked List is Palindrome
	// T.C : O(n) and S.C : O(n)
	public static boolean isPalindrome(Node head) {
		Node duplicate = head;
		Node reversedNode = reverseLinkedListR(duplicate);
		while (duplicate != null) {
			if (duplicate.data != reversedNode.data) {
				return false;
			}
			duplicate = duplicate.next;
		}
		return true;
	}
	
	
	public static boolean isPalindromeEfficientSpace(Node head) {	
		Node slow = head;
		Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondHalf = reverseLinkedList(slow.next);
        slow.next = secondHalf;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2!=null){
            if(p1.data!=p2.data) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
	
	public static void main(String[] args) {
		LinkedList.insertAtEnd(10);
		LinkedList.insertAtEnd(20); // 10 -> 20
		LinkedList.insertAtEnd(20);
		LinkedList.insertAtEnd(10);
//		LinkedList.traverse();
//		System.out.println();
//		LinkedList.insertAtEnd(30); // 10 -> 20 -> 30
//		System.out.println("Size of the Linked List : " + LinkedList.sizeOfLL());
//		LinkedList.traverseRecursion(head);
//		LinkedList.insertAtHead(5);
//		LinkedList.traverse();
//		System.out.println();
//		LinkedList.insertAtIndex(15, 1); // Insert 15 at index 1
//		LinkedList.insertAtIndex(11, 100);
//		LinkedList.insertAtEnd(40);
//		LinkedList.traverse();
		System.out.println("______");
//		LinkedList.traverse();
//		Node node =  LinkedList.reverseLinkedList(head);
//		LinkedList.displayUsingRecursion(node);
//		head = LinkedList.reverseLinkedListR(head);
		//head = 
//		LinkedList.reverseLinkedList(head);
		LinkedList.traverse();
//		LinkedList linkedList = new LinkedList();
//		linkedList.pairSum(head);
//		System.out.println("Whether Palindrome ? : " + LinkedList.isPalindrome(head));
//		LinkedList.isPalindromeEfficientSpace(head);
//		LinkedList.getMaximumValueInNode(head);
//		LinkedList.findRightMiddleNode(head);
//		LinkedList.findLeftMiddleNode(head);
//		LinkedList.deleteRightMiddleNode(head);
//		LinkedList.deleteAtIndex(1);
//		Node node = getNodeFromEnd(head, 4);
//		System.out.println(node.data);
//		Node node2 = getNodeFromEndOneTraversal(head, 4);
//		System.out.println(node2.data);
//		head = removeNodeFromEndOneTraversal(head, 3);
//		LinkedList.traverse();
//		LinkedList.traverse();
//		System.out.println(LinkedList.tail.data+"Tail's data");
//		int indexToBeSearched = -8;
//		System.out.println("Element present at Index "+indexToBeSearched+" is : "+LinkedList.searchElementInLL(indexToBeSearched));
//		System.out.println(head.data);
//		System.out.println("Sum of the values in Linked List : "+LinkedList.sumOfLinkedList());
//		LinkedList.displayReverseUsingRecursion(head);
	}
}
