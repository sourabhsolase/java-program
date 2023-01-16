class Demo
{
   int size;
   int arr[];

   public Demo(int no)
   {
    System.out.println("inside constructor");
    
    size =no;
    arr= new int[size];
   }   
   protected void finalize()
   {
    System.out.println("inside finalize method");
    arr=null;
   }
}

class finalizemethod
{
    public static void main(String a[])
    {
        Demo obj =new Demo(4);
        obj=null;
         System.gc();
    }
}