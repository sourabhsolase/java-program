import java.util.*;
class pattern
{
    public void display(int irow,int icol)
    {
        for(int i=1;i<=irow;i++)
        {
            for(int j=1;j<=icol;j++)
             {
                if((j==1)||(i==1)||(i==irow)||(j==icol)||(i==j))
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
    }
}

class program40_5
{
    public static void main(String a[])
    {
        Scanner sobj =new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int irow=sobj.nextInt();
        System.out.println("enter the number of columns :");
        int icol=sobj.nextInt();
     pattern obj=new pattern ();
     obj.display(irow,icol);
    }
}