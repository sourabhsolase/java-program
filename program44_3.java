import java.util.*;
class myarray
{
    public int search(char arr[],char ch)
    {
        int icnt=0,icount=0;
        for(icnt=0;icnt<arr.length;icnt++)
        {
            if(arr[icnt]==ch)
            {
               icount++;
    
            }
              
     
        }
        return icount;
    }

}

class program44_3
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
        System.out.println("enter another character :");
        char ch=sobj.next().charAt(0);
       myarray obj=new myarray();
       int iret=obj.search(arr ,ch);
       System.out.println("character is presrnt in array "+iret+" times");
    }
}