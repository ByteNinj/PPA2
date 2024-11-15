#include<stdio.h>
   int addition(int n1,int n2)
     {
        int add=0;
        add=n1+n2;
        return add;
     }


int main()
{
  int no1=0,no2=0 , ans=0;
  printf("Enter fist number\n");
  scanf("%d",&no1);
  printf("Enter second number\n");
  scanf("%d",&no2);
  ans=addition(no1,no2);

   printf("Addition of given numbers is:::%d\n",ans);
   




    return 0;
}