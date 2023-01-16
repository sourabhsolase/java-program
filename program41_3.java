 import java.util.*;
class myarray
{
    public void odddisplay(int arr1[],int arr2[])
    {
        System.out.println ("elements of first  array are :");
        for(int icnt=0;icnt<arr1.length;icnt++)
        {
            if((arr1[icnt]%2)!=0)
            {
            System.out.println(arr1[icnt]+"\t");
            }
        }
        System.out.println();
        System.out.println ("elements of second array are :");
        for(int icnt=0;icnt<arr2.length;icnt++)
        if((arr2[icnt]%2)!=0)
            {
            System.out.println(arr2[icnt]+"\t");
            }
    
        System.out.println();
    }

}

class program41_3
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
       obj.odddisplay(arr1,arr2);   
     }
}