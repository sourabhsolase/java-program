
import java.util.*;
class Book
{
    public String Name;
    public int price;
    public Book (String s, int i)
    {
        this.Name =s;
        this.price=i;

    }
 public void Display()
 {
    System.out.println("Bookname: " +this.Name+"price :"+this.price);
 }

}
  class collection3 
{
    public static void main(String arg[])
    {

       LinkedList <Book>lobj= new LinkedList<Book>();
           
        lobj.add(new Book ("Lets us C",400));
          lobj.add(new Book ("datastructure",580));
           lobj.add(new Book ("c++ programming",980));

             lobj.add(new Book ("angular web devlopment",790));
        Iterator iobj= lobj.iterator();
        Book bref =null;

        System.out.println("elements of linked list are :");

        while(iobj.hasNext())
        {
            bref = (Book)iobj.next();
            bref.Display();
        }
        
         lobj.clear();

    }}