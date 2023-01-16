import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
      Frame fobj = new Frame(title);
    
     fobj.setSize(500,500);

      fobj.setVisible(true);

      Button bobj = new Button("ok");
      fobj.add(bobj);
   
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
class gui6
{
    public static void main(String arg[])
    {
      MarvellousFrame mobj = new MarvellousFrame("Marvellous ppa41");
    }

}