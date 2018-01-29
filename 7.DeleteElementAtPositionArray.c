/*delete element from nth position will take o(n) complexity
*/
#include<stdio.h>
void main()
{

    int arr[100],element,n,num,i;
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
    printf("On which position you want to delete element?");
    scanf("%d",&n);

    for(i=n-1;i<num-1;i++)
    {
        int temp=0;
        arr[i]=arr[i+1];


    }

    printf("Array after deleting element  :\n");
    for(i=0;i<num-1;i++)
    {
        printf("%d\n",arr[i]);

    }




}
