/*
 * Zulfekar
 * 
 */
package labsheet2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Labsheet2 {
public static void main(String[] args) {
Connection myConnection = null;
ResultSet rs = null;
CallableStatement cs = null;
try
{
// establish connection to database
myConnection = DriverManager.getConnection("jdbc:mysql://localhost/book");
// using the stored procedure show_allauthors() that was created above
cs = myConnection.prepareCall("{call show_allauthors()}");
rs = cs.executeQuery();
while (rs.next())
{
    int authorID = rs.getInt("authorID");
    String authorName = rs.getString("authorName");
    System.out.println("Author ID:"+authorID+" ");
    System.out.print("Author Name:"+authorName);
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


