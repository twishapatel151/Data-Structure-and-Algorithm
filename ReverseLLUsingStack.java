package stack;

public class ReverseLLUsingStack {
	
	node head;
	int length;
	public class node{
		int data;
		node next;
		public node(int d) {
			
			data=d;
			next=null;
			
		}
	}
	
	
	
	public void push(int d) {
		node n=new node(d);
		n.next=head;
		head=n;
	}
	
	public void print() {
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	public int count() {
		node temp=head;
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}
		return length;
	}
	
	
	public class stack{
		int top;
		int size;
		node a[];
		public stack(int n) {
			top=-1;
			size=n;
			a= new node[size];
		}
		
		
		public void pushstack(node data) {
			if(top>=size-1)
			{
				System.out.println("stack is overflow!!");
			}
			a[++top]=data;	
		}
		
		public node pop() {
			if(top==-1)
			{
				System.out.println("stack is empty!");
			}
			
			node popelement=a[top];
			top--;
			return popelement;
			
		}
		
		public node top() {
			return a[top];
		}
		public boolean IsEmpty() {
			return(top==-1);
		
		}
		
	}
	
	 public void reverse() {
		
		 int l=count();
		 stack st=new stack(l);
		 node temp=head;
		 while(temp!=null)
		 {
			
			 st.pushstack(temp);
			 temp=temp.next;
		 }
		 
		 node temp2= st.top();
		 head=temp2;
		 st.pop();
		 while(!st.IsEmpty())
		 {
			temp2.next=st.top();
			st.pop();
			temp2=temp2.next;
		 }
		 temp2.next=null;
		 
		 
		 
		 
	}
	
	public static void main(String[] args) {
		ReverseLLUsingStack rev=new ReverseLLUsingStack();
		rev.push(1);
		rev.push(2);
		rev.push(3);
		rev.push(4);
		rev.push(5);
		rev.push(6);
		System.out.println("before reverse:");
		rev.print();
		rev.reverse();
		System.out.println();
		System.out.println("After reverse:");
		rev.print();
		
	}


}
