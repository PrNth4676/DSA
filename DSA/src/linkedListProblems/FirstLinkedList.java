package linkedListProblems;

public class FirstLinkedList {
	
	public int traverseByGap(Node head, int k) {
		if(head==null) {
			return -1;
		}
		Node p,q;
		q=head;
		p=head;
		k = k-1;
		while(k-- >=0 && q!=null) {
			q=q.next;
		}
		if(q==null) {
			return -1;
		}
		while(q!=null) {
			q=q.next;
			p=p.next;
		}
		return p.data;
	}
	
	public static void main(String[] args) {
	}
}
