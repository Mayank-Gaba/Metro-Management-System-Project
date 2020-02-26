import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class MyDatabase 
{  
    public static Connection DataConnect()
    {
        Connection conn;
        try 
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MetroDB","mayank","123");
            return conn;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    } 
}
