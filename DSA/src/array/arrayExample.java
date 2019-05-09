package array;

public class arrayExample {
	
	public static void main(String[] args) {
		int intarray[];
		intarray=new int[20];
		intarray[0]=0;
		for(int i=1;i<intarray.length;i++)
		{
			intarray[i]=i;
			System.out.print(intarray[i]+" ");
		}
		
	}

}
