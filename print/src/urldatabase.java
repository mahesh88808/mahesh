import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author SynTech
 */
public class urldatabase {
public static Connection connect()
     {
         Connection con=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/url","localhost","");
             JOptionPane.showMessageDialog(null, "connection success");   
 } catch (Exception e) {
        System.out.println("inter.DBConnect.connect()");
    }
   return con;
}
 public static void main(String[] args) {
    connect();
}
}

