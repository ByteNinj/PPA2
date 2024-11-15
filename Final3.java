class Demo
{
  public int no1;
 final public int no2;
         public Demo(int A,int B)
         {
            no1=A;
            no2=B;
         }

}


class Final3
{
    public static void main(String a[])
    {
      Demo dobj=new Demo(11,21);
       Demo dobj1=new Demo(10,20);

      System.out.println("Value of no1 is "+dobj.no1);
       System.out.println("Value of no1 is "+dobj.no2);

       System.out.println("Value of no1 is "+dobj1.no1);
       System.out.println("Value of no1 is "+dobj1.no2);

       dobj.no1++;
      // dobj.no2++;   Error

      dobj1.no1++;
     //  dobj1.no2++;   Error   

     System.out.println("Value of no1 is "+dobj.no1);
       System.out.println("Value of no1 is "+dobj.no2);

       System.out.println("Value of no1 is "+dobj1.no1);
       System.out.println("Value of no1 is "+dobj1.no2);


    }

}