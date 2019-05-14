package baseDatos;
import java.sql.*;
import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;


public class coneccionDB {

    Statement stmt;
    ResultSet rset;

    public Connection getConexion(String serverName, String user, String pass, String portNumber, String sid) throws ClassNotFoundException, SQLException{
        Connection connection = null;
        String cdn = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@"+serverName+":"+portNumber+"/"+sid;
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
