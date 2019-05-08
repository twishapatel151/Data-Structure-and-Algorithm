

public class LLInsertNodeFront {
	
	Node head;
	static class Node {
		int data;
		Node next;
		 
		public Node(int d) {
			this.data=d;
			this.next=null;
			// TODO Auto-generated constructor stub
		}
		
		
	}
	public void InsertNode(Node newnode) {
		newnode.next=head;
		head=newnode;	
		
	}
	
	public void printlist() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}
	 
	public static void main(String[] args) {
		LLInsertNodeFront ll=new LLInsertNodeFront();
		ll.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		Node newnode=new Node(5);
		
		ll.head.next=second;
		second.next=third;
		
		System.out.println("Before Inserting new node :");
		ll.printlist();
		
		ll.InsertNode(newnode);
		
		System.out.println("\nAfter Inserting new node :");
		ll.printlist();
		
	}

}
