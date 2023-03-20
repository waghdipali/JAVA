import java.sql.*;          // 1

class CreateTable
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/students";
        String Username = "root";
        String Password ="";
       // String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        Statement sobj = cobj.createStatement();

        String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " + 
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

        sobj.executeUpdate(sql);
        System.out.println("Created table in given database...");
    }
}
