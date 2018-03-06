
public class SwapNodeLL {
	
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int d) {
			this.data=d;
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
	
	public void SwapNode(int x,int y) {
		if(x==y) return;
		Node prevX=null,currX=head;
		while(currX!=null && currX.data!=x)
		{
			prevX=currX;
			currX=currX.next;
			
		}
		
		Node prevY=null,currY=head;
		while(currY!=null && currY.data!=y)
		{
			prevY=currY;
			currY=currY.next;
			
		}
		
		if(currX==null || currY==null)
		{
			return;
		}
		
		if(prevX!=null)
		{
			prevX.next=currY;
		}
		else
		{
			head=currY;
		}
		
		if(prevY!=null)
		{
			prevY.next=currX;
		}
		else
		{
			head=currX;
		}
		
		Node temp=null;
		temp=currX.next;
		currX.next=currY.next;
		currY.next=temp;
		
		
		
	}
	
	public static void main(String[] args) {
		SwapNodeLL ll=new SwapNodeLL();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		System.out.print("\n Linked list before calling swapNodes() ");
		ll.PrintLL();
		ll.SwapNode(1, 2);
		System.out.print("\n Linked list after calling swapNodes() ");
		ll.PrintLL();
	
	}

}
