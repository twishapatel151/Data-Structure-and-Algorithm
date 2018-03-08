public class FindMiddleElemen {

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
	
	public int FindNoMiddle() {
		int mid_data=0;
		Node n=head;
		int count=0;
		while(n!=null)
		{
			count++;
			n=n.next;
		}
		count=count/2;
		int head_count=0;
		n=head;
		while(n!=null)
		{
			head_count++;
			if(head_count==count) 
			{
				mid_data=n.data;
				break;
			}
			n=n.next;
			
			
		}
		return mid_data;
	}
	
	
	
	public static void main(String[] args) {
		FindMiddleElemen ll=new FindMiddleElemen();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.PrintLL();
		System.out.println("middle element is:"+ll.FindNoMiddle());
	}
	
}
