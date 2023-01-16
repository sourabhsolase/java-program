import java.util.*;
class mystring
{
    public boolean rotatin(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        
    
        String temp =str1+str1;
         if((temp).contains(str2))
           {   
            return true;
        }
        else
        {
            return false;
        }
    

    }
}

class program45_1
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter first the string :");
        String str1 =sobj.nextLine();
        System.out.println("enter the second string :");
        String str2 =sobj.nextLine();
        
      mystring obj=new mystring();
      boolean bret=obj.rotatin(str1,str2);
      if(bret==true)
      {
           System.out.println("Yes " + str2 + " is rotation of " + str1);  
        }
         else
         {  
            System.out.println("No " + str2 + " is not rotation of " + str1);  
      }
    }
}