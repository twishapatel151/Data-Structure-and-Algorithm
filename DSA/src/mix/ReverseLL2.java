


public class ReverseLL2 {
		Node head;
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
		
		public void printll() {
			Node n=head;
			while(n!=null)
			{
				System.out.print(n.data+" ");
				n=n.next;
			}
		}
		
		
		
		public void RevreseLL() {
			Node n=head;
			Node prev=null,next=null;
			
			while(n!=null)
			{	
					next=n.next;
					n.next=prev;
					prev=n;
					n=next;		
				
			}
			head=prev;
		}
		
		public static void main(String[] args) {
			ReverseLL2 fm=new ReverseLL2();
			fm.push(1);
			fm.push(2);
			fm.push(3);
			fm.push(4);
			fm.push(5);
			fm.push(6);
			fm.printll();
			fm.RevreseLL();
			System.out.println("\nReverse List");
			fm.printll();
			
		}


	}


