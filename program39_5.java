import java.util.*;

class pattern
{
    public void display(String str)
    {
        int length=str.length();
        char arr[]=str.toCharArray();
       
        for(int i=0;i<length;i++)
        {
           for(int j=0;j<length;j++)
            {
               if(j<i)
               {
                 System.out.print(arr[j]+"\t");
               }
               else
               {
                 System.out.print("#\t");
               }
            }
            System.out.println();
        }
         for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                 if(j<length-i)
                {
                    System.out.print(arr[j]+"\t");
                }
                else
                {
                System.out.print("#\t");
                }
             }
            System.out.println();
       }
   }
    
}
class program39_5
{
    public static void main(String a[])
    {
        Scanner sobj =new Scanner(System.in);
        System.out.println("enter the string :");
        String str =sobj.nextLine();
        
        pattern obj=new pattern();
        obj.display(str);
    }
}