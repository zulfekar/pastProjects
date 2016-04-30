
import javax.swing.*;
import java.awt.*;
public class CreateTabs {
    public static void main(String[]args)
    {
          JFrame frame = new JFrame("Tabbed Pane Frame");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JTabbedPane tab = new JTabbedPane();
  frame.add(tab, BorderLayout.NORTH);
  
  JButton button = new JButton("1");
  tab.add("Tab 1", button);
  
  button = new JButton("2");
  tab.add("Tab 2", button);
  
  frame.setSize(400,400);
  frame.setVisible(true);
    }
}
