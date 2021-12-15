import java.sql.*;

public class sample {
public static void main(String[] arg){
    try{
        Class.forName("com.mysql.jdbc.Driver");

    }catch(Exception ee){
       System.out.println(ee.toString());
    }
}
}
