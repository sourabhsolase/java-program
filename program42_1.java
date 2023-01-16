import java.util.*;

class myarray
{
    public int diffarray(int arr1[],int arr2[])
    {
        int ifsum=0,issum=0;
        for(int icnt=0;icnt<arr1.length;icnt++)
        {
            ifsum=ifsum+arr1[icnt];
        }
        for(int icnt=0;icnt<arr2.length;icnt++)
        {
            issum=issum+arr2[icnt];
        }


     return ifsum-issum;   
    }
}
class program42_1
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the size of first array :");
        int isize1=sobj.nextInt();
        System.out.println("enter the size of second array :");
        int isize2=sobj.nextInt();

        int arr1[];
        arr1=new int[isize1];
        System.out.println("please enter the"+arr1.length+"elements of first array");
        for(int icnt=0;icnt<arr1.length;icnt++)
        {
            System.out.println("enter the elements number :"+(icnt+1));
            arr1[icnt]=sobj.nextInt();
        }
        int arr2[];
        arr2=new int [isize2];
        System.out.println("please enter the"+arr2.length+"elements of second array");
        for(int icnt=0; icnt<arr2.length;icnt++)
        {
            System.out.println("enter the element number:"+(icnt+1));
            arr2[icnt]=sobj.nextInt();
        }
           myarray obj=new myarray();
           int iret=obj.diffarray(arr1,arr2);
           System.out.println("differnce of addtion is:"+iret);       
    }
}