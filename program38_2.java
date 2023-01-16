import java.util.*;

class pattern
{
    public void display(String str)
    {
        int i=0,j=0;
        for(i=0;i<str.length();i++)
        {
            for(j=0;j<=i;j++)
            {
                    System.out.print(str.charAt(j)+"\t");
               
            }
         System.out.println();
        }
    }
}

class program38_2
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the string :");
        String str =sobj.nextLine();
    
    pattern obj=new pattern();
    obj.display(str);
    }
}