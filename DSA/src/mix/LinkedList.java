//this tutorials is for creating linked list with java
public class LinkedList {
	
	Node head;
	//we have created node class for creating node of linked list
	//we have data variable which store data and next variable which store address of next node 
	static class Node{
		int data;
		Node next;
		
		Node(int data) {
			this.data=data;
			next=null;
		}
		
		
		public static void main(String[] args) {
			LinkedList list1=new LinkedList();
			
			list1.head=new Node(1);
			Node second=new Node(2);
			Node third=new Node(3);
			
			list1.head.next=second;
			second.next=third;
		}
	}
}
