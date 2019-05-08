
public class LengthOfLLiterative {
	
	
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
	

    public void printLL() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
			count++;
		}
	}
	
	
	public static void main(String[] args) {
		LengthOfLLiterative ll=new LengthOfLLiterative();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		
		ll.printLL();
		System.out.println("Length of LinkedList is :"+count);
	}

}
