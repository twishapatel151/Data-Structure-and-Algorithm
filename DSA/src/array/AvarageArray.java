package array;

import java.util.Scanner;

public class AvarageArray {
	public static void main(String[] args) {
		int n,sum=0;
		float avg;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of integer you want in array:");
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum:"+sum);
		avg=sum/n;
		System.out.println("Average:"+avg);
		in.close();
		
		
	}
	
}
