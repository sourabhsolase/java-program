import java.util.*;
 class myarray
 {
    public int arraycapital(char arr[])
    {
        int icount=0;
      for(int icnt=0;icnt<arr.length;icnt++)
        {
            if((arr[icnt]>='A')&&(arr[icnt]<='Z'))
            {
                icount++;
            }
        }
    
    return icount;
    }
 }
 
class program43_4
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the size for characters :");
        int isize =sobj.nextInt();
        char[]arr=new char[isize];
        System.out.println("enter the "+arr.length+"elements of array");
        for(int icnt=0;icnt<arr.length;icnt++)
           {
            System.out.println("enter the element character :"+(icnt+1));
            arr[icnt]=sobj.next().charAt(0);
           }
           
           myarray obj=new myarray();
       int iret=obj.arraycapital(arr);
       System.out.println("count of captial character is :"+iret);
    }
}