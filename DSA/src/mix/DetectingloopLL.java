import java.util.HashSet;

public class DetectingloopLL {

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
		
		public boolean LoopDetection(Node node) {
			//storing addresses of all the nodes 
			HashSet<Node> addresses=new HashSet<>();
			while(node!=null)
			{
				if(addresses.contains(node))
				{
					return true;
				}
				addresses.add(node);
				node=node.next;
			
			}
			return false;
			
			
		}
		
		
		public static void main(String[] args) {
			DetectingloopLL fm=new DetectingloopLL();
			fm.push(1);
			fm.push(2);
			fm.push(3);
			fm.push(4);
			fm.printll();
			//creating loop 
			fm.head.next.next.next.next=fm.head;
			if(fm.LoopDetection(fm.head))
			{
				System.out.println("\nloop found!!!");
			}
			else
			{
				System.out.println("\nloop not found!!");
			}
			
			
			
		}


	}
