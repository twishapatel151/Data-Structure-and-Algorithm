//array traverse from first to end .This operation will take o(n) time complexity because we are traversing whole array till end element and printing those elements
#include<stdio.h>
#include<conio.h>
void main(){
    int n,arr[20];
    printf("Enter the size of array less than 20\n");
    scanf("%d",&n);
    int i=0;
    printf("Enter the elements:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);

    }
    printf("array :\n");
    for(i=0;i<n;i++)
    {
        printf("element at a[%d] is : %d\n",i,arr[i]);

    }


}
