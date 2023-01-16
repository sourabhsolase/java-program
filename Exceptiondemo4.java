import java.util.*;

class Exceptiondemo4
{
    public static void main(String arr[])
    {
        Scanner sobj =new Scanner(System.in);

        int ino1=0,ino2=0, ians=0;
        
        System.out.println("enter frist number");
        ino1=sobj.nextInt();
    
     System.out.println("enter second number");
        ino2=sobj.nextInt();
      try
      {
        System.out.println("inside try block");
      ians=ino1/ino2;
        System.out.println("division is :"+ians);
              
      }
      catch(ArithmeticException obj)
       {
       System.out.println("inside catch 1 ");
       System.out.println(obj);
      }
      
     
      catch(Exception obj)
      {
          System.out.println("inside catch 3 ");
          System.out.println(obj);
      }
     finally
     {
       System.out.println("inside finally block");
               sobj.close();
     }
    }
}