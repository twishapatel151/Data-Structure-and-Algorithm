public class LLInsertNodeafterGivenNode {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
			public Node(int d) {
				// TODO Auto-generated constructor stub
				 this.data=d;
				 next=null;
			}		
		}
		
	
	public void printlist() {
			Node n=head;
			while(n!=null)
			{
				System.out.print(n.data+" ");
				n=n.next;
			}
		}
	
	public void InsertNode(Node beforeNode,int newdata)
	{
		if(beforeNode==null)
		{
			System.out.println("The given node should not be null");
			return;
		}
		Node Newnode=new Node(7);
		Newnode.next=beforeNode.next;
		beforeNode.next=Newnode;
		
		
		
	}
	
	
	public static void main(String[] args) {
		LLInsertNodeafterGivenNode ll=new LLInsertNodeafterGivenNode();
		ll.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		ll.head.next=second;
		second.next=third;
		System.out.println("Before Inserting new node :");
		ll.printlist();
		
		ll.InsertNode(second, 7);
	
		System.out.println("\nAfter Inserting new node :");
		ll.printlist();
	
		
	}

}
