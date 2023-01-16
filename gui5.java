import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
      JFrame fobj = new JFrame(title);
    
     fobj.setSize(500,500);

      fobj.setVisible(true);
   
       fobj.addWindowListener(new marvellousListener());  
    }
}
class marvellousListener extends WindowAdapter 
{
   
public void windowClosing(WindowEvent obj)
{
    System .exit(0);
}

}
class gui5
{
    public static void main(String arg[])
    {
      MarvellousFrame mobj = new MarvellousFrame("Marvellous ppa41");
    }

}