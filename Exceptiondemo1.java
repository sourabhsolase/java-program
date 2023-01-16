import java.util.*;

class Exceptiondemo1
{
    public static void main(String arr[])
    {
        Scanner sobj =new Scanner(System.in);

        int ino1=0,ino2=0, ians=0;
        
        System.out.println("enter frist number");
        ino1=sobj.nextInt();
    
    System.out.println("enter second number");
        ino2=sobj.nextInt();
      


      ians=ino1/ino2;

      System.out.println("division is :"+ians);
              
    }
}