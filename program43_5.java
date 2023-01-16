import java.util.*;
class myarray
{
    public void percentage(float arr[])
    {
        System.out.println("marks of student with class");
        for(int icnt=0;icnt<arr.length;icnt++)
        {
            if((arr[icnt]<35)&&(arr[icnt]>0))
            {
                System.out. println(arr[icnt] + " fail");
            }
              else if((arr[icnt]>=35)&&(arr[icnt]<=50))
            {
                System.out. println(arr[icnt] + " pass class");
            }
             else if((arr[icnt]>50)&&(arr[icnt]<=60))
            {
                System.out .println(arr[icnt] + " seocnd class");
            }      
             else if((arr[icnt]>60)&&(arr[icnt]<=70))
            {
                System.out .println(arr[icnt] + " first class");
            }
              else if((arr[icnt]>70)&&(arr[icnt]<=100))
            {
                System.out .println( arr[icnt] + " first class with distinction");
            }
            else
            {
                System.out.println(arr[icnt] + "invlid marks");
                
            }
            
        }
    }
}
class program43_5
{
    public static void main(String a[])
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("enter the number of student :");
        int isize=sobj.nextInt();
        float arr[]=new float[isize];
        
        for(int icnt=0;icnt<arr.length;icnt++)
        {
            System.out.println("enter the marks of roll number:"+(icnt+1) );
            arr[icnt]=sobj.nextFloat();
        }
      myarray obj=new myarray();
      obj.percentage(arr);
    
      }

}