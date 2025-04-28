package circularSinglyLinkedList;

public class CircularSinglyLinkedList {
	Node head;
	Node tail;
	static int count;
	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
			count++;

		}
		else {
			tail.next=node;
			tail=node;
			tail.next=head;
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
	
	public void insertNodeAtAnyPosition(int pos,int data) {
		Node node=new Node(data);
		if(pos==1) {
			node.next=head;
			head=node;
			tail.next=head;
			count++;
		}
		else {
			
		}
	}
	
	public void update(int pos,int data) {
		
	}
	
	public void delete(int pos) {
		for(int )
	}
}
