import java.util.*;
class myarray
{
public void sumdisplay(int arr1[],int arr2[])
{
    int ifsum=0,issum=0;
    for(int icnt=0;icnt<arr1.length;icnt++)
    {
        ifsum=ifsum+arr1[icnt];
    }
        System.out.println("addition of frist array elements is :"+ifsum);
    
     for(int icnt=0;icnt<arr2.length;icnt++)
     {
        issum=issum+arr2[icnt];
     }
        System.out.println("additon of second array elements is:"+issum);
     

}
} 

class program41_5
{
    public static void main(String a[])
    {
       
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the size of first array: ");
        int isize1 =sobj.nextInt();
     
         System.out.println("enter the size of second aaray : ");
        int isize2 =sobj.nextInt();
     
         int arr1[];
         arr1=new int [isize1];
        System.out.println("please enter the "+arr1.length +"elemenets for first array");
        for(int icnt=0;icnt<arr1.length;icnt++)
        {
             System.out.println ("enter the elements no : "+(icnt+1));
            arr1[icnt] =sobj .nextInt();
        }

       
        int arr2[];
        arr2=new int [isize2];
        System.out.println("please enter the "+arr2.length +"elemenets for second array");
        for(int icnt=0;icnt<arr2.length;icnt++)
        {
             System.out.println ("enter the elements no : "+(icnt+1));
            arr2[icnt] =sobj .nextInt();
        }
            myarray obj=new myarray();
       obj.sumdisplay(arr1,arr2);
    }
    
 }

