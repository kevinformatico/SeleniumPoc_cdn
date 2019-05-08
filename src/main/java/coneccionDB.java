import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;


public class coneccionDB {

    String url,user,pass;


    Connection con = DriverManager.getConnection(url,user,pass);

}
