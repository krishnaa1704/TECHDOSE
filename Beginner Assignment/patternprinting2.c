#include <stdio.h>

int main() {
    int i,j,n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        for(j=5;j>=i;j--){
            printf("%d",j);
        }
        printf("\n");
    }

    return 0;
}
