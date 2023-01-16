import java.io.*;

class createfile
{
   public static void main(String a[])
   {
              File fobj=new File("marvellous.txt");
       if(fobj.createNewfile())
       {
        System.out.println("file created succesfully");

       }
       else
       {
        System.out.println("unable to create the file");

       }
   }
}