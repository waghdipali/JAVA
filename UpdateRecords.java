import java.sql.*;

class UpdateRecords
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/students";
        String Username = "root";
        String Password = "";
        String Query = "SELECT *FROM Registration";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);
        Statement sobj = cobj.createStatement();

        String sql = "UPDATE Registration " +
            "SET age = 30 WHERE id in (100,101)";
        sobj.executeUpdate(sql);

        ResultSet rs = sobj.executeQuery(Query);

        while(rs.next())
        {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Age: " + rs.getInt("age"));
            System.out.println("First: " + rs.getString("first"));
            System.out.println("Last: " + rs.getString("last"));
            
        }
    }
}