#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
    int i,sum=0,a;
    scanf("%d",&a);
    for(i=0;i<=a;i++){
        sum=sum+i;
    }
    printf("The sum of %d natural numbers is %d",a,sum);
    return 0;
}
