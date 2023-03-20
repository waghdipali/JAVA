import java.sql.*;          // 1

class  SelectRecords
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/students";
        String Username = "root";
        String Password ="";
        String Query = "SELECT * FROM Registration";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        Statement sobj = cobj.createStatement();
        ResultSet rs = sobj.executeQuery(Query);

        while(rs.next())
        {
            
            // Display values
             System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Age: " + rs.getInt("age"));
            System.out.println("First: " + rs.getString("first"));
            System.out.println("Last: " + rs.getString("last"));
            
            // System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4));
           // cobj.close();
        }
    }
}
