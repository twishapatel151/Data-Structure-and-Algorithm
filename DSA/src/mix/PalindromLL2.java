package linkedlist;
public class PalindromLL2 {
	Node head;
	Node second_half;
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
	
	public void printLL() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	 boolean CheckPalindrome() {
		Node slow_ptr=head;
		Node fast_ptr=head;
		Node midnode=null;
		Node prev_of_slow=null;
		while(fast_ptr!=null && fast_ptr.next!=null)
		{
			fast_ptr=fast_ptr.next.next;
			prev_of_slow=slow_ptr;
			slow_ptr=slow_ptr.next;
		}
		if(fast_ptr!=null)
		{
			midnode=slow_ptr;
			slow_ptr=slow_ptr.next;
			
		}
		second_half=slow_ptr;
		prev_of_slow.next=null;
		reverse();
		
		boolean res=CompareList(head,second_half);
		
		reverse();
		if(midnode!=null)
		{
			prev_of_slow.next=midnode;
			midnode.next=second_half;
		}
		else
		{
			prev_of_slow.next=second_half;
		}
		
		return res;
		
		
	}

	 void reverse() {
		Node prev=null; 
		Node next=null;
		Node temp_head=second_half;
		while(temp_head!=null)
		{
			next=temp_head.next;
			temp_head.next=prev;
			prev=temp_head;
			temp_head=next;
		}
		second_half=prev;
	}
	 
	 
	 boolean CompareList(Node head,Node secondNode)
	 {
		 Node temp1=head;
		 Node temp2=secondNode;
		 while(temp1!=null && temp2!=null)
		 {
			 if(temp1.data==temp2.data)
			 {
				 temp1=temp1.next;
				 temp2=temp2.next;
			 }
			 else {
				return false;
			}
		 }
		 
		 if(temp1==null && temp2==null)
		 {
			 return true;
		 }
		 
		 return true;
	 }
	public static void main(String[] args) {
		PalindromLL2 ll=new PalindromLL2();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		ll.printLL();
		if(ll.CheckPalindrome())
		{
			System.out.println("\nlist is palindrome!");
		}
		else {
			System.out.println("\nlist is not palindrome!");
		}
		
	}
	
	
	
}
