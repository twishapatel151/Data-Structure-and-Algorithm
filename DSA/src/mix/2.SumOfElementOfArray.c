//do sum of elements in array
#include<stdio.h>
#include<conio.h>>
void main(){
    int arr[]={10,20,30,40,50};
    int size=sizeof(arr)/sizeof(arr[0]);
    int i,sum=0;
    for(i=0;i<size;i++)
    {
        sum+=arr[i];

    }
    printf("Sum of elements in array: %d\n",sum);
}
