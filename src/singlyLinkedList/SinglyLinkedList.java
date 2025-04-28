package singlyLinkedList;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count;
	public void insert(int data) {
		Node node=new Node(data);
		
		if(head==null) {
			head=node;
			tail=node;
			count++;
		}
		else {
			tail.next=node;
			tail=node;
			count++;
		}
	}
	
	public void display() {
		if(head==null) {
			System.out.println("No Data Available");
			return;
		}
		Node node=head;
		while(node!=null) {
			System.err.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	
	public void update(int pos,int data) {
		Node node=head;
		for(int i=1;i<=count;i++) {
			if(i==pos) {
				node.data=data;
				System.out.println("Node updated");
				return;
			}
			node=node.next;
		}
	}
	
	
	
	public void insertNodeAtAnyPosition(int pos,int data) {
		Node node= head;
		for(int i=1;i<=count;i++) {
			if(i==pos-1) {
				Node newNode= new Node(data);
				Node temp=node.next;
				node.next=newNode;
				newNode.next=temp;
				count++;
				System.out.println("Node Inserted");
				return;
				
			}
			node=node.next;
		}
	}
	
	public 
	
}
