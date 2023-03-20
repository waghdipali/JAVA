import java.sql.*;

class LikeClause
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/students";
        String Username = "root";
        String Password = "";
        String Query = "SELECT *FROM Registration";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);
        Statement sobj = cobj.createStatement();

        System.out.println("Fetching records without condition...");

        ResultSet rs = sobj.executeQuery(Query);

        while(rs.next())
        {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Age: " + rs.getInt("age"));
            System.out.println("First: " + rs.getString("first"));
            System.out.println("Last: " + rs.getString("last"));
            
        }

        System.out.println("Fetching records with condition...");
        String sql = "SELECT * FROM Registration" + 
            " where first Like '%an%' ";
        rs = sobj.executeQuery(sql);

                while(rs.next())
        {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Age: " + rs.getInt("age"));
            System.out.println("First: " + rs.getString("first"));
            System.out.println("Last: " + rs.getString("last"));
            
        }
       // rs.close();
    }
}