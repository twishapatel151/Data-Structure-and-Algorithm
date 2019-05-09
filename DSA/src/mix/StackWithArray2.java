
public class StackWithArray2 {
	int top;
	int size;
	char a[];
		public StackWithArray2(int n) {
			top=-1;
			size=n;
			a=new char[size];
		}
	
	public void push(char c) {
		if(top==size-1)
		{
			System.out.println("stack is overflow!!");
		}
		a[++top]=c;
	}
	
	
	public char pop() {
		if(top==-1)
		{
			System.out.println("stack is empty!!");
		}
		char c=a[top];
		top--;
		return c;
	}
	
	public int top() {
		return a[top];
	}
	
	public void IsEmpty() {
		if(top<0)
		{
			System.out.println("Stack is empty");
		}
		
	}
	
	public void print() {
		for(int i=0;i<=top;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	

}
