
public class NthNodeLL {
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
	
	
	public int getNthNode(int position) {
		Node temp=head;
		int count=0;
		int data=0;
		while(temp!=null)
		{
			if(count==position)
			{
				data=temp.data;
				break;
			}
			count++;
			temp=temp.next;
			
		}
		
		return data;
	}
	
	public static void main(String[] args) {
		NthNodeLL ll=new NthNodeLL();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.PrintLL();
		int position=2;
		int data=ll.getNthNode(position);
		System.out.println("\nThe node at index "+position+" is:"+data);
	}

}
