public class FindMiddleElement3 {
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
	
	
	
	public int findmiddle() {
		int count=1;
		Node mid=head;
		while(head!=null)
		{
			if(count%2==0)
			{
				mid=mid.next;
			}
			count++;
			head=head.next;
		}
		
		return mid.data;
	}
	
	public static void main(String[] args) {
		FindMiddleElement3 fm=new FindMiddleElement3();
		fm.push(1);
		fm.push(2);
		fm.push(3);
		fm.push(4);
		fm.push(5);
		fm.push(6);
		fm.printll();
		System.out.println("\nMiddle element of LL:"+fm.findmiddle());
		
	}

}
