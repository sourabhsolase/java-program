  import java.util.Scanner;

class ArrayUser
{
    public static void main (String arg[])
    {
        int iCnt=0;
        
        int iSum=0;
         Scanner sobj =new Scanner(System.in);
        
        System.out.println("enter the size of arry :");
             int iSize = sobj.nextInt();
             //int arr[]=(int *)malloc(isize *sizeof(int));
             int Arr[]=new int[iSize];

      System.out.println("number of elements in the array are :"+Arr.length);

       System.out.println("entr the elements of array :");
       for(iCnt=0; iCnt<Arr.length;iCnt++)
       {
           Arr [iCnt]=sobj.nextInt();
       }

        System.out.println("element of the array are :");
        for(iCnt=0; iCnt<Arr.length;iCnt++)
       {
           System.out.println(Arr[iCnt]);
     
      }
      
        for(iCnt=0; iCnt<Arr.length;iCnt++)
       {
           iSum =iSum +Arr[iCnt];
       }
       System.out.println("addition is :"+iSum);
    }
}