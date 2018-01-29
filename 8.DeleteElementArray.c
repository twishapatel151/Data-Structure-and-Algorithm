#include<stdio.h>
void main()
{
    int arr[100],element,num,i;
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
        printf("value at %d position is : %d\n",i,arr[i]);
    }
    printf("Enter the element which you want to delete:\n");
    scanf("%d",&element);
    int position=FindElement(arr,num,element);
    if(position==-1)
    {
        printf("Element not Found!!");
    }
    else
    {
        DeleteElement(arr,num,position);
    }


}
int FindElement(int arr[],int num,int element)
{
    int i;
    for(i=0;i<num;i++)
    {
        if(arr[i]==element)
        {

            return i;
        }
    }
    return -1;
}

void DeleteElement(int arr[],int num,int position)
{
    int i;
    for(i=position;i<num-1;i++)
    {
        arr[i]=arr[i+1];
    }

    printf("New array after deleting element\n");
    for(i=0;i<num-1;i++)
    {
        printf("%d\n",arr[i]);
    }

}
