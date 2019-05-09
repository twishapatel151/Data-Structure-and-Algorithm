package array;

public class arrayrotation1 {
	
	public static void main(String[] args) {
	arrayrotation1 rotate=new arrayrotation1();
	int arr[]={1,2,3,4,5,6,7};
	rotate.printArray(arr);
	rotate.rotateleft(arr, 4);
	System.out.println("\nAfter rotation:");
	rotate.printArray(arr);
	}
	
	public void printArray(int arr[]) {
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
	}
	
	public void rotateleft(int arr[],int n) {
		int temp[]=new int[n];
		int l=arr.length;
		for(int i =0;i<n;i++)
		{
			temp[i]=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				arr[j]=arr[j+1];
			}
		}
		int j=0;
		for(int i=l-n;i<l;i++)
		{
			
			arr[i]=temp[j];
			j++;
		}
		
		
		
		
		
	}
	
	

}
