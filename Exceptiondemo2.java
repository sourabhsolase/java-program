import java.util.*;

class Exceptiondemo1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int arr[]={10,20,30,40};

        System.out.println("enter the index of array");

      int i =sobj.nextInt();

      System.out.println("data at the specified index is :"+arr[i]);

    }
}