package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class stack{
	
	int size;
    int top;
    char[] a; 
	public stack(int n) {
		// TODO Auto-generated constructor stub
		top=-1;
		this.size=n;
		 a=new char[size];
	}
	
	boolean isEmpty()
    {
        return (top < 0);
    }
      
	
	public void push(char c) {
		if(top>=size)
		{
			System.out.println("Stack is overflow!");
			return;
		}
			a[++top]=c;	
	}
	 public char pop() {
		 if(top<0)
		 {
			 System.out.println("Stack is underflow!!");
			 return 0;
		 }
		 else
		 {
			 char c=a[top--];
			 return c;
		 }
	}
	
	
	
}


public class ReverseStringWithStack {
	
	public void reverse(StringBuffer name1) {
		int n=name1.length();
		stack s=new stack(n);
		for(int i=0;i<n;i++)
		{
			s.push(name1.charAt(i));
		}
		
		for(int i=0;i<n;i++)
		{
			char ch= s.pop();
			name1.setCharAt(i, ch);
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String name=reader.readLine();
		StringBuffer  s= new StringBuffer(name);
		System.out.println("Original String is :"+name);
		ReverseStringWithStack r=new ReverseStringWithStack();
		r.reverse(s);
		System.out.println("Reversed String is :"+s);
		
	}
	
	 

}
