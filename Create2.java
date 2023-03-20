import java.sql.*;          // 1

class Create2
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/";
        String Username = "root";
        String Password ="";
       // String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        Statement sobj = cobj.createStatement();        // 3

        String sql="CREATE DATABASE STUDENT1";
        sobj.executeUpdate(sql);
        System.out.println("Database created successfully...");
    }
}


// execute()            Create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert