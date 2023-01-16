import java.util.*;

class myarray
{
    public void mindisplay(int arr1[],int arr2[])
    {
       int ifmin=arr1[0],ismin=arr2[0];
       for(int icnt=0;icnt<arr1.length;icnt++)
       {
        
        if(arr1[icnt] <ifmin)
        {
            ifmin=arr1[icnt];
        }
       }
       System.out.println("minimum element of first array is:" +ifmin);
    
    for(int icnt=0;icnt<arr2.length;icnt++)
    {
        if(arr2[icnt] <ismin)
        {
           ismin= arr2[icnt];
        }
    }
    System.out.println("minimum element of seccond array is:" +ismin);
    }
}
class program42_2
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
       
       System.out.println("enter the size of frist array :");
       int isize1=sobj.nextInt();
       System.out.println("enter the size of second array :");
       int isize2=sobj.nextInt();

       int arr1[];
       arr1=new int [isize1];
       System.out.println("enter the "+arr1.length+"element of first array");
       for(int icnt=0;icnt<arr1.length;icnt++)
       {
        System.out.println("enter the element number "+(icnt+1));
        arr1[icnt]=sobj.nextInt();
       }
       int arr2[];
       arr2=new int [isize2];
       System.out.println("enter the "+arr2.length+" element of second array");
       for(int icnt=0;icnt<arr2.length;icnt++)
       {
        System.out.println("enter the element number "+(icnt+1));
         arr2[icnt]=sobj.nextInt();
       }

       myarray obj=new myarray();
       obj.mindisplay(arr1,arr2);


    }
}