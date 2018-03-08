
//here assume that linked list having unique members
public class SwapNodesLLoptimize {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
		this.data=data;
		this.next=null;
		}
	}
	
	public void push(int d) {
		
		Node newnode=new Node(d);
		newnode.next=head;
		head=newnode;
	}
	
	public void printLL() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void SwapNode(int x,int y) {
		
		if(x==y) {return;}
		
		Node Curr=head,prevX=null,prevY=null,prev=null,CurrX=null,CurrY=null;
		while(Curr!=null)
		{
			
			
			if(Curr.data==x)
			{
				CurrX=Curr;
				prevX=prev;
			}
			if(Curr.data==y)
			{
				CurrY=Curr;
				prevY=prev;
			}
			
			
			prev=Curr;
			Curr=Curr.next;
		}
		
		if (CurrX == null || CurrY == null)
            return;
		
		if(prevX!=null && prevY!=null)
		{
			prevX.next=CurrY;
			prevY.next=CurrX;
		}
		
		if(prevX==null)
		{
			head=CurrY;
			prevY.next=CurrX;
		}
		
		if(prevY==null)
		{
			head=CurrX;
			prevX.next=CurrY;
		}	
		Node temp=CurrX.next;
		CurrX.next=CurrY.next;
		CurrY.next=temp;
		
	}	
	
	public static void main(String[] args) {
		SwapNodesLLoptimize sl=new SwapNodesLLoptimize();
		sl.push(1);
		sl.push(2);
		sl.push(3);
		sl.push(4);
		sl.push(5);
		System.out.println("before swapping:");
		sl.printLL();
		sl.SwapNode(1,4);
		System.out.println("\nafter swapping:");
		sl.printLL();
	}

}
