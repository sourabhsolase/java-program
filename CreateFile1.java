import java.io.*;

class CreateFile1
{
    public static void main(String arg[]) throws Exception
    {
        File fobj = new File("Marvellaus.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File created succesfully");
        }
        else
        {
            System.out.println("Unable to create the file");
        }
    }
}