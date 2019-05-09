
public class LLtraversal {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d) {
			this.data=d;
			next=null;
			// TODO Auto-generated constructor stub
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
	
	public static void main(String[] args) {
		LLtraversal ll=new LLtraversal();
		ll.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		ll.head.next=second;
		second.next=third;
		
		ll.printlist();
		
	}
	

}
