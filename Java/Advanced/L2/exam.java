
package labsheet2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class exam
{
    public static void main(String[] args) {
    Connection myConnection = null;
    ResultSet rs = null;
    CallableStatement cs = null;
        
    try
        {

            myConnection = DriverManager.getConnection("jdbc:mysql://localhost/exam");
       

             cs = myConnection.prepareCall("{call show_allweb()}");
            rs = cs.executeQuery();
            
        while (rs.next())
            {
                 int webID = rs.getInt("websiteID");
                 String url = rs.getString("websiteURL");
                 String des = rs.getString("websiteDescription");
                 System.out.println("website ID:"+webID+" ");
                 System.out.println("website URL:"+url);
                 System.out.print("website Description:"+ des);
                 System.out.println();
            }

    }
            catch (SQLException e) 
    {
     e.printStackTrace();
     System.exit(1);
}    
    
finally 
    {
        try
        {
            rs.close();
            myConnection.close();
        } // end try
        catch ( Exception exception )
        {
            exception.printStackTrace();
        } // end catch
    } // end finally
    } // end main method
} // end class
