import javax.swing.*;
import java.awt.*;

public class JTableComponent{
  public static void main(String[] args) 
{
  JTableComponent as= new JTableComponent();
  }

  public JTableComponent(){
  JFrame frame = new JFrame("Creating JTable Component Example!");
  JPanel panel = new JPanel();
  String data[][] = {{"vinod","BCA","A",},{"Raju","MCA","b"},{"Ranjan","MBA","c"},{"Rinku","BCA","d"}};

    String col[] = {"Name","Course","Grade"};
  
    //create an instance of JTAble
  JTable table = new JTable(data,col);
  
  //adding the table to the panel
  //panel.add(table,BorderLayout.CENTER);
  panel.setLayout(new BorderLayout()); // unless already there
  panel.add(table, BorderLayout.CENTER);
 // panel.add(table.getTableHeader(), BorderLayout.NORTH);
  
  //adding the panel to the frame
  frame.add(panel);
  
  
  frame.setSize(300,200);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}