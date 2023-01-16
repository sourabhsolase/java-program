import java.util.*;
class myarray
{
    public boolean chkpallindrome(int arr[])
    {
        boolean bflag=true;
        int isatrt=0;
        int iend=arr.length-1;
        while(isatrt<iend)
        {
            if(arr[isatrt]!=arr[iend])
            {
               bflag=false;
               break;    
                
            }
            isatrt++;
            iend--;
        }
        return bflag;
    }
}

class program42_5
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner (System.in);
        System.out.println("enter the size of array :");
        int isize=sobj.nextInt();

        int arr[];
        arr=new int [isize];
        System.out.println("enter the"+arr.length+"elements of array ");
        for(int icnt=0;icnt<arr.length;icnt++)
        {
            System.out.println("enter the element number:"+(icnt+1));
                arr[icnt]=sobj.nextInt();
        }

          myarray obj=new myarray();
          boolean bret =obj.chkpallindrome(arr);
          if(bret==true)
          {
            System.out.println("array is pallindrome");
          }
          else
          {
            System.out.println("array is not pallindrome");
          }

        
    }
}