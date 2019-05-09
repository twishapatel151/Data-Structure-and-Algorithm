package stack;
public class Stackwitharray {
	static final int max=100;
	int top=-1;
	int a[]=new int[max];	
	void push(int x)
	{
		if(top==max-1)
		{
			System.out.println("Stack is overflow");
		}
	
		a[++top]=x;
		
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Error:No element to pop");
			return 0;
		}
		int data=a[top];
		top--;
		return data;
	}
	
	int Top()
	{
		return a[top];
	}
	
	void Print()
	{
		System.out.print("Stack:");
		for(int i=0;i<=top;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	void IsEmpty() {
		if(top<0)
		{
			System.out.println("Stack is empty");
		}
	}
	
	public static void main(String[] args) {
		Stackwitharray stack=new Stackwitharray();
		stack.push(1);
		stack.push(2);
		stack.push(23);
		stack.push(23);
		System.out.println(stack.pop()+" is poped");
		stack.push(3);
		stack.push(9);
		stack.Print();
		System.out.println();
		System.out.println(stack.top);
		
		
		
	}

}
