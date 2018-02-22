public class LLInsertNodeEndOfList {
	
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
	public void InsertNode(int newdata) {
		Node newnode=new Node(newdata);
		if(head==null)
		{
			head = new Node(newdata);
			return;
		}
		
		newnode.next=null;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		
		last.next=newnode;
		return;
		
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
		LLInsertNodeEndOfList ll=new LLInsertNodeEndOfList();
		ll.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		
		ll.head.next=second;
		second.next=third;
		
		System.out.println("Before Inserting new node :");
		ll.printlist();
		
		ll.InsertNode(7);
		
		System.out.println("\nAfter Inserting new node :");
		ll.printlist();
		
	}

}
