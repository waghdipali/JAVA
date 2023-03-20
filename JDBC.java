import java.sql.*;
class JDBC{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ppa41","root","");
                //
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from student where marks>70");
                while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
                con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}