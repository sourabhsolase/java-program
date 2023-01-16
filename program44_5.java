import java.util.*;
class myarray
{
    public void pattern(int arr[])
    {
    for(int icnt=0;icnt<arr.length;icnt++)

    {
        for(int i=0;i<arr[icnt];i++)
        {
        if((arr[icnt]%2)==0)
        {
        System.out.print("*\t");
        }

    }
     System.out.println();
    }
}

}

class program44_5
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int isize =sobj.nextInt();

        int arr[]=new int [isize];
        System.out.println("enter the "+arr.length+"elements");
        for(int icnt=0;icnt<arr.length;icnt++)
        {
            System.out.println("enter the element number"+(icnt+1));
            arr[icnt]=sobj.nextInt();

        }
            myarray obj=new myarray();

         obj. pattern(arr);

    }
}