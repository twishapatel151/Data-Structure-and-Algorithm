/*this program is for inserting element at last position in array
Imp notes:
1.Inserting element at last position will take o(1) time if array is not full but if array is full then we need to use new array
and copy elements and insert all other elements again on new array along with new element so it will take o(n) time
2.If we are inserting elements at middle position for that we need to shift other elements so it will take o(n) time
3.Inserting element at first position in array will need o(n) time because we need to shift all elements in array
here we are doing operation of entering element on nth positions in array so complexity will depend on position
*/
#include<stdio.h>
void main(){

    int arr[100],element,n,num,i,position;
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
    printf("On which position you want to enter element?");
    scanf("%d",&n);
    printf("Enter element which you want to enter into array:\n");
    scanf("%d",&element);
    for(i=num-1;i>=n-1;i--)
    {
        arr[i+1]=arr[i];
        arr[i]=0;

    }
    arr[n-1]=element;
    printf("New array after adding element:\n");
    for(i=0;i<=num;i++)
    {
        printf("%d\n",arr[i]);

    }

}

