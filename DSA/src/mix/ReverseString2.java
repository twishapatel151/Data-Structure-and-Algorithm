
public class ReverseString2 {

	
	
	public void reverse(StringBuffer str) {
		StackWithArray2 sa=new StackWithArray2(str.length());
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			sa.push(a);
		}
		
		for(int i=0;i<str.length();i++)
		{
			char a=sa.pop();
			str.setCharAt(i, a);
		}
		
	}
	
	
	public static void main(String[] args) {
		ReverseString2 r=new ReverseString2();
		StringBuffer s=new StringBuffer("Helloo");
		System.out.println("before reverse:"+s);
		r.reverse(s);
		System.out.println("After reverse:"+s);
	}
	
	
}
