package linkedlist;

import java.util.ArrayList;

public class PalindromLL {
	
	Node head;
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
		
			this.data=data;
			this.next=null;
			// TODO Auto-generated constructor stub
		}
	}

	
public void push(int data) {
	Node n=new Node(data);
	n.next=head;
	head=n;
	
}

public void printLL() {
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}


public void FindPalindrom() {
	Node temp=head;
	boolean flag=true;
	ArrayList<Integer> array=new ArrayList<>();
	while(temp!=null)
	{
		
		array.add(temp.data);
		temp=temp.next;
			
	}
	int count=array.size();
	for(int i=0;i<count;i++)
	{
		if(array.get(i)!=array.get(count-i-1))
		{
			flag=false;
		}
		
	}
	if(flag==true)
	{
		System.out.println("\nList is palindrome");
	}
	else
	{
		System.out.println("\nList is not palindrome");
	}
	
}
	
	public static void main(String[] args) {
		PalindromLL pp=new PalindromLL();
		pp.push(1);
		
		
		pp.printLL();
		pp.FindPalindrom();
	}
	
	
	
	
}
