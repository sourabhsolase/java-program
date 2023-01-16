import java.sql.*;

class database
{
    public static void main(String arg[])throws Exception
    {
        String URL="jdbc:mysql://localhost;3306/ppa41";
        String Username="root";
        Stirng password="root"; 
         Stirng Query ="select * from student";

        Connection cobj =DriverManager.getConnection(URL,Username,password);
    
    Statment sobj =cobj.createStatment();

    ResultSet robj =sobj.executeQuery(Query);
    
    while(robj.next())
    {
        System.out.println("RID :"+robj.getInt("RID"));
    System.out.println("name :"+robj.getString("RID"));
    System.out.println("city :"+robj.getString("RID"));
     System.out.println("marks :"+robj.getInt("marks"));
    
    
    }
    
    
    }
}