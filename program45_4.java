import java.util.*;
class mystring
{
    public void removex(String str,char ch)
    {
        int i=0;
        char arr[]=str.toCharArray();
        for( i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                arr[i]=' ';     
            }
          
        }
     System.out.println();
    }
}


class program45_4
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the  string :");
        String str=sobj.nextLine();
        System.out.println("enter character which you want to remove :");
        char ch=sobj.next().charAt(0);
      mystring obj=new mystring();
      obj.removex(str,ch);
    }

}