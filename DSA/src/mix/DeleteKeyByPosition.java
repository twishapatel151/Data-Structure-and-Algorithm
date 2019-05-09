
public class DeleteKeyByPosition {
	Node head;
	class Node {
		int data;
		Node next;
		public Node(int d) {
			// TODO Auto-generated constructor stub
			this.data=d;
			next=null;
		}
		}
	
	
		public void push(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
		}
	
		public void PrintLinkedlist() {
			Node n=head;
			while(n!=null)
			{
				System.out.print(n.data+" ");
				n=n.next;
			}
			
		}
		
		public void DeleteNodeByPosition(int position) {
			Node prev=null,temp=head;
			if (temp==null)
			{
				return;
			}
			
			if(position==0)
			{
				head=head.next;
				return;
			}
			
			int i=0;
			while(i!=position)
			{
				prev=temp;
				temp=temp.next;
				i+=1;
				if(temp.next==null && position>=i)
				{
					System.out.println("\nPlease Enter proper number!!! there will be no node on "+position+" position");
					return;
				} 
				
			}
		
			
			
			prev.next=temp.next;
		}
		
		public static void main(String[] args) {
		DeleteKeyByPosition ll=new DeleteKeyByPosition();
			ll.push(1);
			ll.push(2);
			ll.push(3);
			ll.push(4);
			System.out.println("before list");
			ll.PrintLinkedlist();
			ll.DeleteNodeByPosition(5);
			System.out.println("\nAfter list");
			ll.PrintLinkedlist();
			}

}
