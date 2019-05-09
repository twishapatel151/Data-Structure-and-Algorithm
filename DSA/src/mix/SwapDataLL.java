
public class SwapDataLL {
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
	
	public int SwapData(int x,int y) {
		Node n=head;
		Node xnode=null,ynode=null;
		
		int x1=0,y1=0;
		while(n!=null)
		{
			if(n.data==x)
			{
				x1++;
				xnode=n;
			}
			if(n.data==y)
			{
				y1++;
				ynode=n;
			}
			n=n.next;
		}
		
		if(y1==0 || x1==0 )
		{	System.out.println(x1+"   "+y1);
			return 1;
		}
		else
		{
			int temp=0;
			temp=xnode.data;
			xnode.data=ynode.data;
			ynode.data=temp;
			
			
			
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		SwapDataLL ll=new SwapDataLL();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		System.out.println("Before swapping node:");
		ll.PrintLL();
		int result=ll.SwapData(5, 4);
		if(result==1)
		{
			System.out.println("\n any one of node from input is not availaible in LL!!");
		}
		else if(result==0)
		{
			System.out.println("\nAfter swapping");
			ll.PrintLL();
		}
	}
}
