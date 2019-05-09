package array;

import java.util.Scanner;

public class SearchKeyElementArray {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter number of elements you want in array:");
		int n =in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter all elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter elements you want to search in array:");
		int key=in.nextInt();
		SearchKeyElementArray src=new SearchKeyElementArray();
		src.findElement(arr, key);
		
	}
	
	public void findElement(int[] arr,int key) {
		int i=0;
		boolean flag=true;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key){
				flag=false;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element found on "+i+" position");
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}


}
