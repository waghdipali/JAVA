import java.sql.*;          // 1

class DropDatabase
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/student1";
        String Username = "root";
        String Password ="";
       // String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        Statement sobj = cobj.createStatement();

        String sql = "DROP DATABASE STUDENT1";
        sobj.executeUpdate(sql);

        System.out.println("Database Dropped successfully...");
    }
}
