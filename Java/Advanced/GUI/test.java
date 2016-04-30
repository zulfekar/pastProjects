
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class test
{
    JTabbedPane tab;
    public static void main(String []args)
    {
        test a=new test();
    }
    
    public test()
    {
        String data[][] = {{"Tab 0","JTable"},{"Tab 1","JLabel"},{"Tab 2","JLabel"},{"Tab 3","JLabel"},{"Tab 4","JLabel"},};

    String col[] = {"TabName","Content"};
        JFrame frame= new JFrame("TabComponentsDemo");
         tab = new JTabbedPane();
         JLabel btn0= new JLabel("x");
        JButton btn1= new JButton("x");
        JButton btn2= new JButton("x");
        JButton btn3= new JButton("x");
        JButton btn4= new JButton("x");
        JLabel label0 = new JLabel("Tab0");
        JLabel label1 = new JLabel("Tab1");
        JLabel label2 = new JLabel("Tab2");
        JLabel label3 = new JLabel("Tab3");
        JLabel label4 = new JLabel("Tab4");
        JPanel panel1 = new JPanel();
        JPanel TabPanel0 = new JPanel();
        JPanel TabPanel1 = new JPanel();
        JPanel TabPanel2 = new JPanel();
        JPanel TabPanel3 = new JPanel();
        JPanel TabPanel4 = new JPanel();
        JTable table = new JTable(data,col);
        
        
        panel1.add(table,BorderLayout.CENTER);
        panel1.setLayout(new BorderLayout()); // unless already there
        panel1.add(table, BorderLayout.CENTER);
        panel1.add(table.getTableHeader(), BorderLayout.NORTH);
        
        TabPanel0.add(label0);
        TabPanel0.add(btn0);
        
        TabPanel1.add(label1);
        TabPanel1.add(btn1);
        
        TabPanel2.add(label2);
        TabPanel2.add(btn2);
        
        TabPanel3.add(label3);
        TabPanel3.add(btn3);
        
        TabPanel4.add(label4);
        TabPanel4.add(btn4);
      
    
        tab.add(panel1);
        tab.add(new JLabel("Tab 1"));
        tab.add(new JLabel("Tab 2"));
        tab.add(new JLabel("Tab 3"));
        tab.add(new JLabel("Tab 4"));
        
        tab.setTabComponentAt( 0, TabPanel0);
        tab.setTabComponentAt( 1, TabPanel1);
        tab.setTabComponentAt( 2, TabPanel2 );
        tab.setTabComponentAt( 3, TabPanel3 );
        tab.setTabComponentAt( 4, TabPanel4 );
        frame.add(tab);
  
  
        btn0.setToolTipText("Close this tab");
        btn1.setToolTipText("Close this tab");
        btn2.setToolTipText("Close this tab");
        btn3.setToolTipText("Close this tab");
        btn4.setToolTipText("Close this tab");
       
  
        //test.ButtonHandler handler = new test.ButtonHandler();
       // btn0.addItemListener(handler);
           
        frame.setSize(600,240);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    private class ButtonHandler implements ActionListener
            {
            public void actionPerformed(ActionEvent e)
            {
               // tab.removeTabAt(); 
            }
    
    }
   
}

