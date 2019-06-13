#include <stdio.h>
int main()
{
  int n;
   
    scanf("%d", &n);
    
    
    for(int i=0; i<n; i++)
    {
      int num =n-i;
        for(int j=0; j<(n-(i-1))-1; j++)
        {
            printf("%d",num);
          num= num - 1;
        }
        
     
        
        printf("\n");
    }
    
    return 0;
}