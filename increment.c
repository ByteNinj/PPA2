#include<stdio.h>
int main()
{
   int A=10, B=10;

   int no1=0,no2=0;
   int c=10,d=10;
     no1=A++;          //post increment(initialise then incement)
      printf("Value of no1:%d\n",no1);//10
      printf("Value of A:%d\n",A);//11


     no2=++B;      //pre increment(increment then initialize)
         printf("Value of no2:%d\n",no2);//11
            printf("Value of B:%d\n",B);//11

         c++;
         ++d;
        printf("%d\n",c);
        printf("\n\n");
        printf("%d\n",d);
    return 0;
}



//A++   
//A=A+1