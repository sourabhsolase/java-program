
import java.util.*;
class collection4 
{
    public static void main(String arg[])
    {

          ArrayList <Float>aobj = new ArrayList<Float>();
    
aobj.add(10.6f);
aobj.add(20.6f);
aobj.add(30.6f);
aobj.add(40.6f);
aobj.add(50.6f);

Iterator iobj =aobj.iterator();
while(iobj.hasNext())
{
    System.out.println(iobj.next());
}
aobj.clear();

    }}  