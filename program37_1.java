import java.util.*;
class pattern
{
    public void display(int irow,int icol)
    {
        int i=0,j=0;
        for(i=1;i<=irow;i++)
        {
            for( j=1;j<=icol;j++)
            {
                System.out.print(" *\t");
            }
            System.out.println();
        }
    }
}
class program37_1
{
    public static void main(String a[])
    {
        Scanner sobj =new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int irow=sobj.nextInt();
        System.out.println("enter the number of columns :");
        int icol=sobj.nextInt();
   pattern obj=new pattern();
   obj.display(irow,icol);
   
    }
}