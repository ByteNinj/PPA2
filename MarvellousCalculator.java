import java.awt.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener
{
public Frame mainframe;
public Button b1,b2,b3,b4;
public TextField t1,t2;
public Label lobj;
Integer no1,no2;

   public Calculator(int width,int height,String Title)
   {
      mainframe=new Frame("Mycalculator");
      mainframe.setSize(width,height);
      mainframe.setVisible(true);
      mainframe.addWindowListener(this);
      b1=new Button("Add");
       b2=new Button("Sub");
        b3=new Button("Mult");
         b4=new Button("Div");

         t1=new TextField();
         t2=new TextField();
     
        lobj=new Label("Result is::");

        b1.setBounds(10,200,80,40);
        b2.setBounds(100,200,80,40);
        b3.setBounds(190,200,80,40);
        b4.setBounds(180,200,250,40);
          
        t1.setBounds(70,100,100,40);
        t2.setBounds(220,100,100,40);

        lobj.setBounds(150,100,200,150);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);
        
        mainframe.add(t1);
        mainframe.add(t2);

        mainframe.add(lobj);


        mainframe.setLayout(null);
        mainframe.setVisible(true);

       b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

   }
public void windowClosing(WindowEvent wobj)
{
    System.exit(0);
}

public void actionPerformed(ActionEvent aobj) 
{
  try
  {
    no1=Integer.parseInt(t1.getText());
     no2=Integer.parseInt(t2.getText());
     if(aobj.getSource()==b1)
     {
        lobj.setText("Addition is::"+(no1+no2));
     }
     else if(aobj.getSource()==b2)
     {
        lobj.setText("Substraction is::"+(no1-no2));
     }
    else if(aobj.getSource()==b3)
     {
        lobj.setText("Multiplication is::"+(no1*no2));
     }
     else if(aobj.getSource()==b4)
     {
        lobj.setText("Divition is::"+(no1/no2));
     }

  }
  catch(Exception eobj)
  {}

}

}



class MarvellousCalculator
{
  public static void main(String a[])
  {
  Calculator cobj=new Calculator(400,400,"Marvellous Calculator");

  }
}