#include<iostream>
using namespace std;

 class base{
 public:
      int i,j;
       base()
       {
          cout<<"Inside base constuctor"<<"\n";
          i=10;
          j=20;
       }
       ~base()
       {
            cout<<"Inside base destuctor"<<"\n";
       }
       void fun()
       {
        cout<<"Inside base fun\n";
       }
       
 };

 class derived:public base
 {
   public:
   int x,y;
    derived()
       {
          cout<<"Inside derived constuctor"<<"\n";
          x=30;
          y=40;
       }
       ~derived()
       {
            cout<<"Inside derived destuctor"<<"\n";
       }
        void gun()
       {
        cout<<"Inside derived gun\n";
       }
       

 };

 class derivedx:public derived
 {
   public:
   int p,q;
    derivedx()
       {
          cout<<"Inside derivedx constuctor"<<"\n";
          p=50;
          q=60;
       }
       ~derivedx()
       {
            cout<<"Inside derivedx destuctor"<<"\n";
       }
        void run()
       {
        cout<<"Inside derivedx run\n";
       }
       

 };
 

 int main()
 {
 //base bobj;
 derivedx dobj;
 cout<<"Inside main function\n";
 cout<<dobj.i<<"\n";  //10
 cout<<dobj.j<<"\n";  //20
 cout<<dobj.x<<"\n";  //30
 cout<<dobj.y<<"\n";  //40
 cout<<dobj.p<<"\n";   //50
 cout<<dobj.q<<"\n";   //60
 
 dobj.fun();
 dobj.gun();
 dobj.run();
 //cout<<sizeof bobj<<"\n";
 cout<<sizeof dobj<<"\n";
 cout<<sizeof (base)<<"\n";    //8
 cout<<sizeof (derived)<<"\n"; //16
 cout<<sizeof (derivedx)<<"\n";//24
 
 

//destuctor:derivedx->derived->base

    return 0;
 }