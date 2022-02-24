package Bankaccountdemo;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
//    private static final String dbClassName= "com.mysql.cj.jdbc.Driver";
    private static final String CONNECTION = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

//    public static java.sql.Connection connection() throws Exception{
////        Class.forName(dbClassName);
//
//        return DriverManager.getConnection(CONNECTION, USER, PASSWORD);
//    }
    public static Connection connection() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(CONNECTION , USER , PASSWORD);
            return connection;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

}
