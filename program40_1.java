import java.util.*;
class pattern
{
    public void display(int irow,int icol)
    {
        for(int i=0;i<irow;i++)
        {
            for(int j=0;j<icol;j++)
            {
               if((i+j)==irow-1)
               {
                
                System.out.print("#\t");
               }
               else
               {
                
                System.out.print("*\t");
               }
            }
         System.out.println();
            
        }


    }
}

class program40_1
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the numberr of rows :");
        int irow =sobj.nextInt();
       System.out.println("enter number of columns :");
       int icol=sobj.nextInt();
       pattern obj=new pattern();
       obj.display(irow,icol);       
    }
}