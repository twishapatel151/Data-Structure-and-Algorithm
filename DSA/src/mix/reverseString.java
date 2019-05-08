import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseString {
	
	
	public StringBuffer reverse(StringBuffer str) {
		
		
		int j=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			if(i>=j)
			{
				break;

			}
			else
			{
				char temp;
				temp = str.charAt(i);
				str.setCharAt(i, str.charAt(j));
				str.setCharAt(j, temp);
				j--;
			}
		}
		
		return str;
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String name=reader.readLine();
		StringBuffer  s= new StringBuffer(name);
		System.out.println("Original String is :"+name);
		reverseString rvrsstr=new reverseString();
		System.out.println("Reversed String is :"+rvrsstr.reverse(s));
		
	}
	

}
