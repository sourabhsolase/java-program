

class equaldemo
{
    public static void main(String A[])
    {
        String s1="hello";
         String s2="hello";
         System.out.println("hashcode of s1 :"+s1.hashCode());
          System.out.println("hashcode of s2 :"+s2.hashCode());
       if(s1.equals(s2))
       {
        System.out.println("objects are same");
       }
       else
       {
         System.out.println("objects are differnt");
       }
      if(s1==s2)
       {
        System.out.println("objects are same");
       }
       else
       {
         System.out.println("objects are differnt");
       }
         
    }
}