import java.util.*;
class myarray
{
    public void copyarray(int arr[])
    {
        System.out.println("elements of array are:");
        for(int icnt=0;icnt<arr.length;icnt++)
        {
          System.out.println(arr[icnt]+"\t");
        }

        int brr[]=arr;
        
        System.out.println("elements of copied reverse  array are:");
        for(int icnt=brr.length-1;icnt>=0;icnt--)
        {
          System.out.println(brr[icnt]+"\t");
        }
    }
}
class program42_3
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int isize=sobj.nextInt();
        int arr[];
        arr=new int[isize];
        System.out.println("enter the "+arr.length+"elemets of array ");
        for(int icnt=0;icnt<arr.length;icnt++)
        {
            System.out.println("enter the elements"+(icnt+1));
            arr[icnt]=sobj.nextInt();
        }   
           myarray obj=new myarray();

         obj.copyarray(arr);
        
    }
}