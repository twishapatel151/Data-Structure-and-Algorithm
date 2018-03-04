public class LengthOfLLrecursive {
	
	Node head;
	static int count=0;
	class Node{
		int data;
		Node next;
		public Node( int d) {
			// TODO Auto-generated constructor stub
			this.data=d;
			next=null;
			
		}
		
	}
	
	public void push(int d) {
		Node newNode=new Node(d);
		newNode.next=head;
		head=newNode;
		
	}

    public int findLengthLL( Node node) {
    	if(node==null)
    	{
    		return 0;
    	}
    	else
    	{
    		return 1+ findLengthLL(node.next);
    	}	
		
	}
    public int getCount() {
		return(findLengthLL(head));
	}
    
	public static void main(String[] args) {
		LengthOfLLrecursive ll=new LengthOfLLrecursive();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		System.out.println("Length:"+ ll.getCount());
		
	}

}
