#include<stdio.h>
int main()
{
  int Number, i, Sum = 0;
  
  
  scanf("%d", &Number);
  
  for(i = 1; i <= Number; i++)
  {
     Sum = Sum + i;
  }
  
  printf("%d", Sum);
  return 0;
}