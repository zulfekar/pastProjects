//import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
  import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * Zulfekar
 */
public class QuestionTwo {
 
JTextArea txt;
JFileChooser fc ;
FileReader fr ;
FileWriter fw;
JScrollPane scl;
File f;
String txtVal="";

  public static void main(String[] args) {
  QuestionTwo s = new QuestionTwo();
  }

  public QuestionTwo(){
  JFrame frame = new JFrame("Creating a JMenuBar, JMenu, JMenuItem and separator Component");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 ButtonHandler handler = new ButtonHandler();
  //create a menubar
  JMenuBar menubar = new JMenuBar();
  txt= new JTextArea ();
  fc = new JFileChooser();

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
  
  fileItem1.addActionListener(new ButtonHandler());
   fileItem2.addActionListener(handler);
   fileItem3.addActionListener(handler);
   fileItem4.addActionListener(handler);
  editItem1.addActionListener(handler);
  editItem2.addActionListener(handler);
  editItem3.addActionListener(handler);
  editItem4.addActionListener(handler);
  
  
  
  //add menus to the menu bar
  menubar.add(filemenu);
  menubar.add(editmenu);
  
  //Sets the menubar for this frame
  frame.setJMenuBar(menubar);
 scl = new JScrollPane(txt);
// scl.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
frame.add(scl);
  //sets the size of the frame and makes it visible
  frame.setSize(600,500);
  frame.setVisible(true);
  }
  
  public class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
      
           if(e.getActionCommand().equals("New")){
           txt.setText("");
           }
           else if (e.getActionCommand().equals("Open")){
           fc.showOpenDialog(null);
            f = fc.getSelectedFile();
                try {
                    fr = new FileReader(f);
                    txt.read(fr,e);
                    txtVal=txt.getText();
                    /// System.out.println(txtVal);
                } catch (IOException ex) {
                    Logger.getLogger(QuestionTwo.class.getName()).log(Level.SEVERE, null, ex);
                }

           }
           else if (e.getActionCommand().equals("Close")){
               
              
               if(txt.getText().equals(txtVal)==false){
                   
          int option=    JOptionPane.showConfirmDialog(txt, "Do you want to save changes ?", "Save", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            
               if(option==JOptionPane.OK_OPTION){
                      try {
                           fw = new FileWriter(f);
                           txt.write(fw);
                           System.exit(1);
                       } catch (IOException ex) {
                           Logger.getLogger(QuestionTwo.class.getName()).log(Level.SEVERE, null, ex);
                       }
               }
                
               }
               else if (txt.getText().equals(txtVal)==true){
                  
           System.exit(1);
               }
           }
           else if (e.getActionCommand().equals("Save")){    
                try {
                    txtVal = txt.getText();
                      fw = new FileWriter(f);
                    txt.write(fw);
                    System.out.println("File saved succesfully");
                } catch (IOException ex) {
                    Logger.getLogger(QuestionTwo.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           else if (e.getActionCommand().equals("Cut")){
          txt.cut();
           }
           else if (e.getActionCommand().equals("Copy")){
           txt.copy();
           }else if (e.getActionCommand().equals("Paste")){
               txt.paste();
           }
           else if (e.getActionCommand().equals("Insert")){
           
           }
        }
  
  }
} 

