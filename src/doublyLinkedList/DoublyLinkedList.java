package doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;
	static int count;
	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			node.previous=null;
			node.next=null;
			count++;
		}
		else {
			node.next=null;
			node.previous=head;
			head.next=node;
			count++;
		}
	}
	public void display() {
		Node node=head;
		for(int i=1;i<=count;i++) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
		
	}
}
