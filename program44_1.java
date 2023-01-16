import java.util.*;
class myarray
{
    public void araayreplace(char arr[])
    {
        int icnt=0;
        for(icnt=0;icnt<arr.length;icnt++)
        {
            if((arr[icnt]>='A')&&(arr[icnt]<='Z'))
            {
               (arr[icnt])=(arr[icnt] + 32) ;
    
            }
              System.out.print(arr[icnt]+"\t");
     
        }
    }

}

class program44_1
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
       obj.araayreplace(arr);
    }
}