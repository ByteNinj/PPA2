#include<stdio.h>
int main()
{
    char ch='A';
    int i=11;
    float f=1.234365;
    double d=236.2566;

    char *cp=&ch;
    int *ip=&i;
    float *fp=&f;
    double *dp=&d;

   void *vp=NULL;

   printf("%c\n",*cp);
   printf("%d\n",*ip);
   printf("%f\n",*fp);
   printf("%lf\n",*dp);
    vp=&ch;
    printf("%c\n",*(char *)vp);
    vp=&i;
    printf("%d\n",*(int *)vp);
    return 0;
}