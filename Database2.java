import java.sql.*;   //1

class Database2
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/ppa41";
        String Username = "root";
        String Password ="";
       String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        
        Statement sobj = cobj.createStatement();        // 3

      //  ResultSet robj = sobj.executeQuery(Query);      // 4

      //  while(robj.next())          // 5
       // {
         //   System.out.println("RID : "+robj.getInt("RID"));
          //  System.out.println("Name : "+robj.getString("Name"));
          //  System.out.println("City : "+robj.getString("City"));
          //  System.out.println("Marks : "+robj.getInt("Marks"));   

      //      System.out.println(robj.getInt(1)+" "+robj.getString(2)+" "+robj.getInt(3)+" "+robj.getString(4));
        //}

        System.out.println("Inserting records into the table...");
        String sql = "INSERT INTO student VALUES (611, 'Dipa','Satana',45)";
        sobj.executeUpdate(sql);

        System.out.println("Inserted records into the tables...");

    }
}










// execute()            Create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert