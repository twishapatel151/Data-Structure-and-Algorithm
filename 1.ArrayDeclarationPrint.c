#include<stdio.h>
#include<conio.h>
void main(){
int arr[]={10,20,30,40,50};
int i=0;
int size=sizeof(arr)/sizeof(arr[0]);
printf(" Size of array is %d\n",size);
for(i=0;i<size;i++)
{
    printf("Number at %d : %d\n",i,arr[i]);
}

}
