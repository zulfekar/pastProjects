import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Exam
{
    JFrame frame;
    JPopupMenu pop;
    JRadioButton rad1;
    JRadioButton rad2;
    JRadioButton rad3;
    JRadioButton rad4;
    public exam()
    {
         frame=new JFrame("Using JPopUpMenus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pop=new JPopupMenu();
      //  pop.setSelectionModel(mode.SINGLE_SELECTION);
        
         rad1=new JRadioButton("Red");
        rad2=new JRadioButton("Blue");
         rad3=new JRadioButton("Yellow");
         rad4=new JRadioButton("Green");
        
        
        rad1.addActionListener(new ButtonHandler());
        
         rad2.addActionListener(new ButtonHandler());
         rad3.addActionListener(new ButtonHandler());
         rad4.addActionListener(new ButtonHandler());
        
         
         
         pop.add(rad1);
         pop.add(rad2);
         pop.add(rad3);
         pop.add(rad4);
        frame.addMouseListener(new MouseAdapter()
        {
            public void mouseReleased(MouseEvent me)
            {
                if(me.isPopupTrigger())
                {
                    pop.show(me.getComponent(),me.getX(),me.getY());
                }
            } } );
        
        
        
         frame.setVisible(true);
        frame.setSize(500,500);
        
        
    }
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str=e.getActionCommand();
            if(rad1.isSelected())
            {
              
               frame.getContentPane().setBackground(Color.RED);
               
            }
            else if(str.equals("Blue"))
            {
                frame.getContentPane().setBackground(Color.blue);
            }
           else if(str.equals("Yellow"))
            {
               frame.getContentPane().setBackground(Color.yellow);
            }
           else if(str.equals("Green"))
            {
                frame.getContentPane().setBackground(Color.green);
            }
            
        }
    }
    public static void main(String[]args)
    {
        exam x= new exam();
    }
            
}