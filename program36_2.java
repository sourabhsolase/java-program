import java.util.*;

class pattern
{
    public void display(int irow,int icol)
    {
        char  ch='A', sh ='a';
        for(int i=1;i<=irow;i++)
        {
            
           ch='A';
           sh='a';
            for(int j=1;j<=icol;j++)
            {
              if((i%2)==0)
              {
                System.out.print(sh+"\t");   
                sh++;         
              }
              else
              {
                System.out.print(ch+"\t");
               ch++;
              }
            }
       System.out.println();
      
        }
       
    }
}
class program36_2
{
    public static void main(String a[])
    {
    Scanner sobj =new Scanner(System.in);
    System.out.println("enter the number of rows :");
    int irow =sobj.nextInt();
    System.out.println("enter the number of columns :");
    int icol =sobj.nextInt();
  
     pattern obj =new pattern();
     obj.display(irow,icol);
    }
}