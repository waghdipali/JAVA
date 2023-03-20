import java.sql.*;          // 1

class  InsertRecords
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/students";
        String Username = "root";
        String Password ="";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        Statement sobj = cobj.createStatement();

      /*  String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " + 
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
        */

        System.out.println("Inserting records into the tables...");

        String sql = "INSERT INTO Registration VALUES(100,'Dipa','Wagh',21)";
        sobj.executeUpdate(sql);
        sql = "INSERT INTO Registration VALUES(101,'Rutu','Bhamare',25)";
        sobj.executeUpdate(sql);
        sql = "INSERT INTO Registration VALUES(102,'Pallu','jadhav',30)";
        sobj.executeUpdate(sql);
        sql = "INSERT INTO Registration VALUES(103,'Panju','Magar',28)";
        sobj.executeUpdate(sql);

        System.out.println("Inserted records into the table...");
    }
}
