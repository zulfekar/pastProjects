import javax.swing.*;
import java.awt.event.KeyEvent;

public class CreateSwingMenu{
  public static void main(String[] args)
  {
  CreateSwingMenu s = new CreateSwingMenu();
  }

  public CreateSwingMenu(){
  JFrame frame = new JFrame("Creating a JMenuBar, JMenu, JMenuItem and separator Component");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  //create a menubar
  JMenuBar menubar = new JMenuBar();
  
  //create a menu item File
  JMenu filemenu = new JMenu("File");
  //allow use of ALT+F from keyboard
  filemenu.setMnemonic(KeyEvent.VK_F);
  
  JMenu editmenu = new JMenu("Edit");
  editmenu.setMnemonic(KeyEvent.VK_E);
  
  //create submenu items
  JMenuItem fileItem1 = new JMenuItem("New");
  JMenuItem fileItem2 = new JMenuItem("Open");
  JMenuItem fileItem3 = new JMenuItem("Close");
  JMenuItem fileItem4 = new JMenuItem("Save");
  JMenuItem editItem1 = new JMenuItem("Cut");
  JMenuItem editItem2 = new JMenuItem("Copy");
  JMenuItem editItem3 = new JMenuItem("Paste");
  JMenuItem editItem4 = new JMenuItem("Insert");
  
  //add the submenu items to the menus
  filemenu.add(fileItem1);
  filemenu.addSeparator();
  filemenu.add(fileItem2);
  filemenu.add(fileItem3);
  filemenu.addSeparator();
  filemenu.add(fileItem4);
  
  editmenu.add(editItem1);
  editmenu.add(editItem2);
  editmenu.add(editItem3);
  editmenu.addSeparator();
  editmenu.add(editItem4);
  
  //add menus to the menu bar
  menubar.add(filemenu);
  menubar.add(editmenu);
  
  //Sets the menubar for this frame
  frame.setJMenuBar(menubar);

  //sets the size of the frame and makes it visible
  frame.setSize(400,400);
  frame.setVisible(true);
  }
}
