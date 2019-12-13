package is.gestionevideo.entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
 private static Connection conn = null;
 private DBManager() {}
 public static Connection getConnection() throws SQLException {
  if(conn==null) {
   conn = DriverManager.getConnection( "jdbc:h2:./C:\\Users\\giuseppe\\Downloads\\GestioneVideo", "sa", "");
  }
  return conn;
 }
 
 public static void closeConnection() throws SQLException {
  if(conn!=null) {
   conn.close();
  }
 }
}