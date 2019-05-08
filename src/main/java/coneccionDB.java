import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;


public class coneccionDB {

    public static Connection getConexion(String user,String pass) {
        Connection connection = null;
        try {
            String driverClassName = "com.oracle.cj.jdbc.Driver";
            String driverUrl="jdbc:oracle://152.139.28.59:3306/BDD_RESULT?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(driverUrl,user,pass);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
