package stack;

public class StackwithLL {
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int data) {
		this.data=data;
		this.next=null;
			// TODO Auto-generated constructor stub
		}	
	}
	
	void push(int data) {
		
		Node newnode=new Node(data);
		newnode.next=top;
		top=newnode;
	}
	void pop()
	{
		if(top==null)
		{
			System.out.println("Stack is empty !no element to pop!!");
		}
		else
		{
			top=top.next;
		}
	}
	
	boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	int top()
	{
		return top.data;
	}
	
	void print()
	{
		Node temp=top;
		System.out.print("Stack:");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		StackwithLL stack=new StackwithLL();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.print();
		stack.pop();
		System.out.println();
		stack.print();
		stack.push(5);
		System.out.println();
		stack.print();
		System.out.println();
		System.out.println(stack.isEmpty());
		System.out.println(stack.top());
		
		
	}
	
	
}
