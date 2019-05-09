

public class FindNthNodeFromEnd {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
			// TODO Auto-generated constructor stub
		}
	}
	
	public void push(int data) {
		Node n=new Node(data);
		n.next=head;
		head=n;
		
	}
	
	public void printll() {
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}
	
	
	public int FindnthNode(int number) {
		
		Node n=head;
		int count=0,endelementfromfirst=0,count2=0;
		while(n!=null)
		{
			count++;
			n=n.next;
		}
		endelementfromfirst=count-number+1;
		
		n=head;
		while(n!=null)
		{
			count2++;
			if(count2==endelementfromfirst)
			{
				break;
			}
			n=n.next;
		}
		
		return n.data;
		
		
	}
	
	
	public static void main(String[] args) {
		FindNthNodeFromEnd ll=new FindNthNodeFromEnd();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.printll();
		System.out.println("Data :"+ll.FindnthNode(2));

		
		
	}

}
