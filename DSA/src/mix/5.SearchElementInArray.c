/*
Searching element in array will take o(n) complexity because if element is not present in array then also we need to traverse whole array so
it will take n times
*/
#include<stdio.h>
void main()
{
    int arr[]={10,20,30,40,50,60,70};
    int element,size;
    printf("Enter the element which you want to search in array:\n");
    scanf("%d",&element);
    size=sizeof(arr)/sizeof(arr[0]);
    int position=FindElement(arr,size,element);

    if (position!=-1)
    {

        printf("Element Found at %d position",position+1);
    }
    else{
        printf("Element not found");
    }

}
int FindElement(int arr[],int size,int element)
{
    int i=0;
    for(i=0;i<size;i++)
    {
        if(arr[i]==element)
        {
            return i;
        }
    }
    return -1;

}
