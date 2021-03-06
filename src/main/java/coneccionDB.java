import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;


public class coneccionDB {
    Connection connection = null;
    Statement stmt;
    ResultSet rset;

    public static Connection getConexion(Connection connection) {

        String serverName = "200.14.169.238";
        String user = "VISTA_360_CN";
        String pass = "VISTA_360_CN_ORION2K16";
        String portNumber = "1521";
        String sid = "ORION";
        String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;

        try {
            String driverClassName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url,user,pass);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public ResultSet RunQuery(String Query) throws IOException{
        try{
            stmt = connection.createStatement();
            rset = stmt.executeQuery(Query);

        }
        catch(SQLException e1){
            System.out.println("Query Execution Error" );
            e1.printStackTrace();
        }
        return rset;
    }

    public void OracleCloseConnection() throws IOException {
        try {
            connection.close();
        } catch (SQLException e1) {
            System.out.println("Query Execution Error");
            e1.printStackTrace();

        }
    }
}
