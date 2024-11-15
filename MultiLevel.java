class Base
{
  public int A,B;
  public Base()
  {
    System.out.println("Inside base constuctor");

  }
  public void fun()
  {
    System.out.println("Inside base fun");
  }

}


class Derived extends Base      //class derived :public base c++
{
  public int x,y;
  public Derived()
  {
     System.out.println("Inside Derived constuctor");
  }

  public void gun()
  {
     System.out.println("Inside derived gun");
  }

}

class Derivedx extends Derived
{
  public int i,j;
  public Derivedx()
     {
       System.out.println("Inside Derivedx constructor");

     }

     public void sun()
  {
     System.out.println("Inside derivedx sun");
  }



}


class MultiLevel
{
    public static void main(String arg[])
    {
    System.out.println("Inside main method"); 
   Derivedx dobj=new Derivedx();
   dobj.fun();
   dobj.gun();
   dobj.sun();


    }
}