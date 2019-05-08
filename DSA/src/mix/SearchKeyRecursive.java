public class SearchKeyRecursive {
	
	
	Node head;
	class Node {
		int data;
		Node next;
		public Node( int data) {
			this.data=data;
			next=null;
			// TODO Auto-generated constructor stub
		}
		
	}
	 public void push(int data) {
		 Node newnode=new Node(data);
		 newnode.next=head;
		 head=newnode;
	}
	 
	 
	 public boolean SearchElementKey(int key) {
		 Node n=head;
		 if(n==null)
		 {
			 return false;
		 }
		 else
		 {
			 if(n.data==key)
			 {
				 return true;
			 }
			head=head.next;
		 }
		 return SearchElementKey(key);
	
	 }
	public static void main(String[] args) {
		SearchKeyRecursive ll=new SearchKeyRecursive();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		boolean result=ll.SearchElementKey(1);
		if(result==true)
		{
			System.out.println("Element is available in LinkedList!!!");
			
		}
		else
		{
			System.out.println("Element is not available in LinkedList!!!!");
		}
	}

}
