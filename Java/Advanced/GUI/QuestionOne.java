

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class QuestionOne
{
    JTabbedPane tab;
    JButton btn;
    int i;
  JLabel lab;
    
    public static void main(String []args)
    {
        QuestionOne a=new QuestionOne();
    }
    
    public QuestionOne()
    {
        String data[][] = {{"Tab 0","JTable"},{"Tab 1","JLabel"},{"Tab 2","JLabel"},{"Tab 3","JLabel"},{"Tab 4","JLabel"},};
          
             
             JPanel pan;
            //  final JLabel lab = null;
    String col[] = {"TabName","Content"};
        JFrame frame= new JFrame("TabComponentsDemo");
        
        
        JPanel panel1 = new JPanel();
      
        JTable table = new JTable(data,col);
        
         panel1.add(table,BorderLayout.CENTER);
        panel1.setLayout(new BorderLayout()); // unless already there
        panel1.add(table, BorderLayout.CENTER);
        panel1.add(table.getTableHeader(), BorderLayout.NORTH);
      
//         tab.add(panel1);
      // tab.add(new JLabel("Tab 0"));
         
         tab = new JTabbedPane();
     
                    for ( i = 0; i < 5; i++)
                      {
                                pan = new JPanel();
                               btn = new JButton( "X");
                              btn.setToolTipText("Close this tab");
                              btn.addActionListener(new ButtonHandler()); 
                
                             lab = new JLabel("Tab "+i);
                             
                           pan.add(lab);
                            pan.add(btn);
                           tab.add(new JLabel("Tab "+i));
                           
                      
                           
                              tab.setTabComponentAt( i, pan);
                 
                        }
                frame.add(tab);
                     
              
   
  
  
       
    
  
        
           
        frame.setSize(600,240);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
   private class ButtonHandler implements ActionListener
            {
           public void actionPerformed(ActionEvent e)
           {
              tab.remove(tab.getSelectedIndex());
               
           }
    
   }
   
}
//USE E.GETSOURCE().......... TO DELETE.