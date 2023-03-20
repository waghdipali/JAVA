import java.sql.*;          // 1

class SelectDatabase
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/student1";
        String Username = "root";
        String Password ="";
       // String Query = "select * from student";

       System.out.println("Connecting to a selected database...");

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
       
        System.out.println("Connected database successfully...");
    }
}
