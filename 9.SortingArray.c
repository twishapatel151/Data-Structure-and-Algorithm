/*
This program sorting array.We have used bubble sort algorithm for sorting array so here
if array is already sorted we sort algorithm in o(n) time but if array is not sorted than it will take o(n^2) complexity
because we are using two for loop

*/
#include<stdio.h>
void main()
{
    int arr[100],element,num,i,j,temp;
    printf("Enter no of elements :");
    scanf("%d",&num);
    printf("Enter elements:\n");
    for(i=0;i<num;i++)
    {
        scanf("%d",&arr[i]);

    }
    printf("Input array is :\n");
    for(i=0;i<num;i++)
    {
        printf("%d\n",arr[i]);
    }
    int count=0;
    for(i=0;i<num;i++)
    {
        count=0;
        for(j=0;j<num-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                count+=1;

            }
        }
        if(count==0)
        {

            break;

        }
    }
    printf("Output Array:\n");
    for(i=0;i<num;i++)
    {
        printf("%d\n",arr[i]);
    }




}




