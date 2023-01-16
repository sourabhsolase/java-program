import java .util.*;
class pattern
{
    public void display(String str)
    {
        int length=str.length();
        char arr[]=str.toCharArray();
       
        for(int i=0;i<length;i++)
        {
            for(int j=0 ;j<length-i;j++)
            {
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }
         for(int i=0;i<length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }
    }

}
class program
{
    public static void main(String a[])
    {
        Scanner sobj =new Scanner (System.in);
        
        System.out.println("enter the string :");
        String str=sobj.nextLine();

        pattern obj=new pattern();
        obj.display(str);
    }
}