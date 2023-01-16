class Employee  implements  Cloneable 
{
    public int Eid;
    public String Name;
    public int salary;

    public Employee(int no,String str,int value)
    {
        this.Eid=no;
        this.Name=str;
        this.salary=value;
    }
    public Object clone()   throws CloneNotSupportedException
    {
         return super.clone ();
    }
}
class clone
{
    public static void main(String a[])
    {
        try{
            Employee eobj1=new Employee(101,"Rahul",11000);
    Employee eobj2=(Employee)eobj1.clone();

    System.out.println("name of frist employee :"+eobj1.Name);
     System.out.println("name of second employee :"+eobj2.Name);

     System.out.println("salary of frist employee :"+eobj1.salary);
     System.out.println("salary of second employee :"+eobj2.salary);

     eobj1.Name ="sagar";
      System.out.println("name of frist employee :"+eobj1.Name);
     System.out.println("name of second employee :"+eobj2.Name);


        }
        catch(CloneNotSupportedException obj)
        {}
    }
}