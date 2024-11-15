#include<iostream>
using namespace std; 
namespace Marvellous
{
    void greet()
    {
       cout<<"function in namespace \n"; 
    }
    class Demo
    {
     public: 
        void Display()
        {
            cout<<"Inside Display\n";
        }
    };
}
int main() 
{
    Marvellous::greet();

    Marvellous::Demo obj;
    obj.Display();
     return 0;
}