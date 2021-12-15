import java.sql.*;

public class sample1 {
    public static void main(String[] arg){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
          System.out.println("Successfully Connected");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
