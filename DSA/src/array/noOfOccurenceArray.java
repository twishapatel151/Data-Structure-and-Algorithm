package array;

import java.util.Scanner;

public class noOfOccurenceArray {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter number of elements you want in array:");
		int n =in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter all elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter elements you want to count no of occurences in array:");
		int key=in.nextInt();
		noOfOccurenceArray src=new noOfOccurenceArray();
		src.findNoOfOccurence(arr, key);
		
	}
	public void findNoOfOccurence(int[] arr,int key) {
		int i=0;
		int counter=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key){
				counter++;
			}
		}
		if(counter>0)
		{
			System.out.println("occurences of "+key+" is "+counter);
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}

}
