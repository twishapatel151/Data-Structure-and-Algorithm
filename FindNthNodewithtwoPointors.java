

public class FindNthNodewithtwoPointors {



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
	
	
	public void FindnthNode(int number) {
		if(head!=null)
		{
			Node ref_ptr=head;
			Node main_ptr=head;
			int list_length=0;
			while(list_length<number)
			{
				if(ref_ptr==null)
				{
					System.out.println(number+" is greater than no of nodes in list");
					return;
				}
				ref_ptr=ref_ptr.next;
				list_length++;
				
			}
			while(ref_ptr!=null)
			{
				ref_ptr=ref_ptr.next;
				main_ptr=main_ptr.next;
			}
			System.out.println("\nData at position:"+number+" from end is:"+main_ptr.data);
			
			
			
		}
	
		
		
	}
	
	
	public static void main(String[] args) {
		FindNthNodewithtwoPointors ll=new FindNthNodewithtwoPointors();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.printll();	
		ll.FindnthNode(2);

		
		
	}

}

	
	
	
