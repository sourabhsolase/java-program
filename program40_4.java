import java.util.*;
class pattern
{
    public void display(int irow,int icol)
    {
        for(int i=0;i<irow;i++)
        {
            for(int j=0;j<icol;j++)
            {
            if((i==1)||(i==irow)||(j==icol)||(j==1)||((i+j)==irow-1))
            {
                System.out.print("*\t");

            }
            else
            {
                System.out.print("$\t");
            }
            }
            System.out.println();
        }

    }
}


class program40_4
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
      int irow=sobj.nextInt();
      System.out.println("enter the number og columns :");
      int icol=sobj.nextInt();
    pattern obj=new pattern();
    obj.display(irow,icol);

    }
}