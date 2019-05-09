public class DetectLoopLL2 {

	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			
			// TODO Auto-generated constructor stub
		}
	}
	
	public void push(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		
		
	}
	
	public void printll() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public boolean LoopDetection(Node node) {
		//storing addresses of all the nodes 
		Node First_ptr=node,second_ptr=node;
		while(First_ptr!=null & second_ptr!=null && second_ptr.next!=null)
		{
			First_ptr=First_ptr.next;
			second_ptr=second_ptr.next.next;
			
			if(second_ptr==First_ptr)
			{
				return true;
			}
		}
		
			return false;
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		DetectLoopLL2 fm=new DetectLoopLL2();
		fm.push(1);
		fm.push(2);
		fm.push(3);
		fm.push(4);
		fm.printll();
		//creating loop 
		fm.head.next.next.next.next=fm.head;
		if(fm.LoopDetection(fm.head))
		{
			System.out.println("\nloop found!!!");
		}
		else
		{
			System.out.println("\nloop not found!!");
		}
		
		
		
	}
	
	
}
