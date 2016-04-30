package labsheet2;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class modified
{   
    public static void main(String[] args) throws SQLException
    {
     Connection con = null;
        ResultSet rs = null;
      try
        {
                
            con = DriverManager.getConnection("jdbc:mysql://localhost/book");
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
            System.exit(1);
        }
        
     
        Statement s = null;
        Statement sDrop = null;
        String createPro;
        createPro =
                        "create procedure show_someauthor() " +
                        "begin " +
                        "select * " +
                        "from authors " +
                        "where authorID='1'; " +
                        "end";
            try {
                    System.out.println("Calling DROP PROCEDURE");
                    sDrop = con.createStatement();
                    sDrop.execute("DROP PROCEDURE IF EXISTS show_someauthor");
                } 
            catch (SQLException e) 
                {
                    e.printStackTrace();
                }
            if (s != null)
                {
                    s.close();
                }
            
            try 
                {
                    s = con.createStatement();
                    s.executeUpdate(createPro);
                } 
            catch (SQLException e) 
                {
                    e.printStackTrace(); 
                }
            if (s != null)
            {
                s.close();
            }
    
      CallableStatement cs = null;
    
try
{
// establish connection to database

// using the stored procedure show_allauthors() that was created above
cs = con.prepareCall("{call show_someauthor()}");
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
           con.close();
        } // end try
        catch ( Exception exception )
        {
            exception.printStackTrace();
        } // end catch
    } // e 
    }}


