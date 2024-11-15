import java.awt.*;
import java.awt.event.WindowAdapter;

class MarvellousListener extends WindowAdapter
{
  public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    
}

class GUI3
{
    public static void main(String a[])
    {
        Frame fobj=new Frame(" Marvellous PPA");
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowListener(new WindowAdapter());
    }
}