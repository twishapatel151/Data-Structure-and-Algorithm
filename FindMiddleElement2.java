public class FindMiddleElement2 {

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
	
	public int FindNoMiddleElement() {
		Node slowptr=head,fastptr=head;
		if(head!=null) {
		while(fastptr!=null && fastptr.next!=null)
		{
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
		}
		
		}
		return slowptr.data;
	}
	
	
	
	public static void main(String[] args) {
		FindMiddleElement2 ll=new FindMiddleElement2();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);
		ll.push(70);
		ll.PrintLL();
		System.out.println("middle element is:"+ll.FindNoMiddleElement());
	}
	
}
