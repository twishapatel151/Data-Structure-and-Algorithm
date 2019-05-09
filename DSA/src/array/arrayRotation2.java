package array;

public class arrayRotation2 {
	public static void main(String[] args) {
		arrayRotation2 rotation=new arrayRotation2();
		int arr[]={1,2,3,4,5,6,7};
		rotation.printArray(arr);
		rotation.rotateLeft(arr, 2);
		System.out.println();
		System.out.println("After rotation:");
		rotation.printArray(arr);		
		
	}	
	public void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	
	public void rotateLeft(int arr[],int n) {
		int temp;
		
		int l=arr.length;
		for(int i=0;i<n;i++)
		{
			temp=arr[0];
			for(int j=0;j<l-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[l-1]=temp;
		}
		
		
	}

}
