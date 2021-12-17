import java.sql.*;

public class Studentqry {
    public static void main(String[] arg){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            System.out.println("Successfully connected");
            Statement stmt= con.createStatement();
            String qr="insert into student(rno,name,Address) values(4,'Reshma','Mahal')";
            stmt.executeUpdate(qr);
            System.out.println("Record saved Successfully");
        }catch(Exception ee) {
        System.out.println(ee.toString());
        }

    }
}
