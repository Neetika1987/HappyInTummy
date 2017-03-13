package happytummy.connect;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


public class ConnectionUtils {
 
	   public static Connection getConnection()
	             throws ClassNotFoundException, SQLException,IOException,FileNotFoundException {
	      
	       return MysqlConnUtils.getMySQLConnection();
	     }
	    
	   public static void closeQuietly(Connection conn) {
	       try {
	           conn.close();
	       } catch (Exception e) {
	       }
	   }
	 
	   public static void rollbackQuietly(Connection conn) {
	       try {
	           conn.rollback();
	       } catch (Exception e) {
	       }
	   }
	}