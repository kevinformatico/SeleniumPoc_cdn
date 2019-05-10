package baseDatos;
import java.sql.*;
import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;


public class coneccionDB {

    Statement stmt;
    ResultSet rset;

    public Connection getConexion() throws ClassNotFoundException, SQLException{
        Connection connection = null;
        String serverName = "200.14.169.238";
        String user = "VISTA_360_CN";
        String pass = "VISTA_360_CN_ORION2K16";
        String portNumber = "1521";
        String sid = "ORION";

        String cdn = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@200.14.169.238:1521:ORION";
        Class.forName(cdn);
        connection = DriverManager.getConnection(url,user,pass);

        return connection;
    }

    public ResultSet RunQuery(Connection connection , String Query) throws IOException{
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

    public void OracleCloseConnection(Connection connection) throws IOException {
        try {
            connection.close();
        } catch (SQLException e1) {
            System.out.println("Query Execution Error");
            e1.printStackTrace();
            System.out.println("nuevaBranch");
        }
    }
}
