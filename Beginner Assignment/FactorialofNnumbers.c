#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
    int i,num,fact=1;
    scanf("%d",&num);
    for(i=1;i<=num;i++){
        fact=fact*i;
    }
    printf("The factorial of %d is %d",num,fact);
    return 0;
}
