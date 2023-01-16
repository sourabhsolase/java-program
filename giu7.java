import java.swing.*;
import java.awt.event.*;


class Student extends WindowAdapter

{
    public JFrame mainframe;
    
    public void windowClosing(WindowEvent obj )
    {
        System.exit(0);
    }
}
class giu7
{
    public static void main(String a[])
    {
        StudentFrame sobj =new StudentFrame(700,700"Student Form");
    }
}