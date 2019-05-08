//complexity of adding element at last is o(1) in this program
#include<stdio.h>
int main(){
int arr[10]={10,20,30,40,50};
int size=sizeof(arr)/sizeof(arr[0]);
int n=5;
int i,element;
printf("Enter  element which you want to add :\n");
scanf("%d",&element);

printf("Current Array:\n");
for(i=0;i<n;i++)
{
    printf("%d\n",arr[i]);

}
int new_n=addElementInarray(arr,n,size,element);
if(new_n>n)
{

    printf("After insertion :\n");
    for(i=0;i<new_n;i++)
    {
        printf("%d\n",arr[i]);

    }
}
else{

    printf("Sorry!No space in array for inserting new element!");

}


}
int addElementInarray(int arr[],int n,int size,int element)
{
    if(n >= size)
    {

        return n;
    }
    arr[n]=element;
    return n+1;

}
