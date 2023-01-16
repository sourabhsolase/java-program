import java.util.*;

class collection2
{
    public static void main(String arg[])
    {
       LinkedList <String>lobj =new LinkedList<String>();

          lobj.add("kapil");
          lobj.add("aditya");
          lobj.add("rohan");
          lobj.add("rutik");
          lobj.add("tejas");

          System.out.println("elements of linked list are :"+lobj);

          lobj.addFirst("pooja");

           System.out.println("elements of linked list are :"+lobj);
            
             lobj.addLast("sneha");
         
           System.out.println("elements of linked list are :"+lobj);
            
            Iterator iobj = lobj.iterator();
            System.out.println("data string is :");
            while(iobj.hasNext())
            {
                System.out.println(iobj.next());
            }
            if(lobj.contains("rohan"))
            {
                System.out.println("rohan is present in LL");
            }

            lobj.remove();

           System.out.println("elements of linked list are :"+lobj);
           
            lobj.remove();

           System.out.println("elements of linked list are :"+lobj);
              
              lobj.remove();

           System.out.println("elements of linked list are :"+lobj);

                lobj.removeLast();

           System.out.println("elements of linked list are :"+lobj);


           System.out.println("number of elements are :"+lobj.size());

           lobj.set(1,"deepak");
      
           System.out.println("elements of linked list are :"+lobj);
           
             

           lobj.clear();
            System.out.println("elements of linked list are :"+lobj);
       }

}