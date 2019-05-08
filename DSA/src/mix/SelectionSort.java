public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[]= {5,4,6,2,1};
		System.out.println("Input arrray");
		
		SelectionSort obj= new SelectionSort();
		obj.PrintArray(arr);
		obj.Sorting(arr);
		System.out.println("output array");
		obj.PrintArray(arr);	
	}
	
	 public void PrintArray(int arr[])
	{
		int i=0;
		int length=arr.length;
		for(i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	 
	
	 
	 public void Sorting(int arr[]) {
		 int i,j,min_pos,count=0,temp=0;
		 for(i=0;i<arr.length-1;i++)
		 {
			 count=0;
			 min_pos=i;
			 for(j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					
					min_pos=j;
					count+=1;
				 }
				 
			 }
			 if(count==0)
			 {
				 
				 break;
			 }
			 temp=arr[i];
			 arr[i]=arr[min_pos];
			 arr[min_pos]=temp;
			 
		 }
		
		 
	}

}
