
public class LLDeleteNodeByKey {

	Node head;
	static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			// TODO Auto-generated constructor stub
			this.data=d;
			next=null;
		}
	}
	
	
	public void PrintLinkList() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}
	
	public void DeleteNode(int key) {
		Node temp=head,prev=null;
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null) return;
		
		prev.next=temp.next;
		
	}
	    
	public static void main(String[] args) {
		LLDeleteNodeByKey ll=new LLDeleteNodeByKey();
		ll.head=new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		Node fourth= new Node(4);	
		ll.head.next=second;
		second.next=third;
		third.next=fourth;
		ll.PrintLinkList();
		ll.DeleteNode(2);
		System.out.println("\nAfter deleting node :");
		ll.PrintLinkList();
		
	}
	
	
}
