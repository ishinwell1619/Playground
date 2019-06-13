#include<stdio.h>

int square(int); // function prototype declaration.

void main()
{
     int number, answer;
    
     
     scanf("%d", &number);
    
     answer = square(number);  //Call function.
    
     printf("%d", answer);
}

int square(int n)
{
     //function logic is written here..
     return(n*n); //This will return answer to main function.
}