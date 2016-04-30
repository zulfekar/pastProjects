
package labsheet2;
import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class UpdateExam
{
    public static void main(String[] args) {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
        
    try
        {

            con = DriverManager.getConnection("jdbc:mysql://localhost/exam");
           String updateString = "UPDATE website SET websiteDescription =? WHERE websiteURL LIKE ?";
           ps=con.prepareStatement(updateString);
           ps.setString(1,"This is a test ");
           ps.setString(2,"http://www.nouzolipay.com");
           ps.executeUpdate();
            
            //rs = cs.executeQuery();
            
       // while (rs.next())
        //   {
              //   int webID = rs.getInt("websiteID");
              //   String url = rs.getString("websiteURL");
              //   String des = rs.getString("websiteDescription");
               //  System.out.println("website ID:"+webID+" ");
              //   System.out.println("website URL:"+url);
              //   System.out.print("website Description:"+ des);
               //  System.out.println();
            //}

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
//            rs.close();
            con.close();
        } // end try
        catch ( Exception exception )
        {
            exception.printStackTrace();
        } // end catch
    } // end finally
    } // end main method
} // end class