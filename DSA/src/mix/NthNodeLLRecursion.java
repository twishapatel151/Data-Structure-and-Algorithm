public class NthNodeLLRecursion {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int n) {
			 data=n;
			 next=null;
			// TODO Auto-generated constructor stub
		}
	}
	
	public void push(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		
	}
	public void PrintLL() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	
	public int getNthNode(Node h,int position) {
		int count=0;
		if(count==position)
		{
			System.out.println(h.data);
			return h.data;
		}
		else
		{
			
			return getNthNode(h.next, position-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		NthNodeLLRecursion ll=new NthNodeLLRecursion();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.PrintLL();
		int position=3;
		
	
		System.out.println("\nThe node at index "+position+" is:"+ll.getNthNode(ll.head,position));
	}

}
