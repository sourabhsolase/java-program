import java.util.*;
class pattern
{
    public void display(int irow,int icol)
    {
    for(int i=irow;i>=1;i--)
    {
        for(int j=icol;j>=1;j--)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    }
}
class program36_4

{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int irow=sobj.nextInt();
        System.out.println("enter the number of columns :");
        int icol=sobj.nextInt();

        pattern obj =new pattern();
        obj.display(irow,icol);
    }
}