import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AddRemoveTab{
  JTabbedPane tab;
  
  
  public AddRemoveTab(){
  JFrame frame = new JFrame("Add Remove Tab Frame");
  tab = new JTabbedPane();

  
  //create a panel and a button which is then added to the panel
  JPanel panel = new JPanel();
  JButton btnAdd = new JButton("Add Tab");
  btnAdd.addActionListener(new ButtonHandler());
  panel.add(btnAdd);
  
  //add the panel to the tab
  tab.add("AddTab", panel);
  
  //create a second panel and button which is added to the second panel
  JPanel panel1 = new JPanel();
  JButton btnRemove = new JButton("Remove Tab");
  btnRemove.addActionListener(new ButtonHandler());
  panel1.add(btnRemove);
  
  //add 2nd panel to tab
  tab.add("Remove Tab", panel1);
  
  frame.setSize(400, 400);
  frame.setVisible(true);
   frame.add(tab, BorderLayout.CENTER);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private class ButtonHandler implements ActionListener{
  public void actionPerformed(ActionEvent e){
  String str = e.getActionCommand();
  
  //check which button has been clicked
  if(str.equals("Add Tab")){
  String st = JOptionPane.showInputDialog(null, "Enter Tab Name.");

  //if user has typed some text, create another JPanel and add to the tab
  if(!st.equals("")){
  JPanel panel2 = new JPanel();
  JLabel label = new JLabel("Your program is working successfully.");
  panel2.add(label);
  tab.add(st,panel2);
  }
  }
  
  //if remove tab has been clicked, get the number of tabs and remove the last one
  else if(str.equals("Remove Tab")){
    //    JOptionPane.showMessageDialog(null," GOOOOOD","Access Granted",JOptionPane.PLAIN_MESSAGE);
  tab.remove(tab.getTabCount()-1);
  }
  }
  }
  public static void main(String[] args){
  AddRemoveTab ar = new AddRemoveTab();
  }

}
