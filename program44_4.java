import java.util.*;
class myarray
{
    public int search(char arr[] )
    {
        int icnt=0,iAcount=0,iscount=0;
        for(icnt=0;icnt<arr.length;icnt++)
        {
            if((arr[icnt]>='A')&&(arr[icnt]<='Z'))
            {
               iAcount++;
    
            }
            else if((arr[icnt]>='a')&&(arr[icnt]<='z'))
              {
                 iscount++;
              }
     
        }
        return iAcount-iscount;
    }

}

class program44_4
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int isize=sobj.nextInt();
        char arr[]=new char[isize];

        System.out.println("entr the "+arr.length+"elements of array");
        for(int icnt=0;icnt<arr.length;icnt++)
        {
            System.out.println("enter the character :"+(icnt+1));
            arr[icnt]=sobj.next().charAt(0);
        }
       
       myarray obj=new myarray();
       int iret=obj.search(arr );
       System.out.println("differnce of frequency  in array "+iret);
    }
}