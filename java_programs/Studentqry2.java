import java.sql.*;

public class Studentqry2 {
    public static void main(String[] arg){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            System.out.println("Connected successfully");
            Statement stmt=con.createStatement();
            String qr="update student set rno=5 where name='Rishi' ";
            stmt.executeUpdate(qr);
            System.out.println("record update Successfully") ;

        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
