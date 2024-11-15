class Student implements Cloneable
{
 public String Name;
 public int Age;
 public int Marks;
    public Student(String A,int B,int C) 
    {
     this.Name="A";
     this.Age=B;
     this.Marks=C;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
   
}


class ObjectDemo4
{
    public static void main(String A[])
    {
         try{
       Student sobj=new Student("Archana",25,89);
       // Student sobj1=sobj;  Shallow copy refering to the same object
        System.out.println("Name is:"+sobj.Name);
         System.out.println("Name is:"+sobj.Age);
          System.out.println("Name is:"+sobj.Marks);
         Student sobj1=(Student)sobj.clone();

          System.out.println("Name is:"+sobj1.Name);
         System.out.println("Name is:"+sobj1.Age);
          System.out.println("Name is:"+sobj1.Marks);
         }
         catch(Exception obj)
         {

         }
    }
}