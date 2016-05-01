import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class parserxml_efficient
{ 
    static String message="";
    static String value ="";
    static int counterOpening = 0;
    static int counterClosing = 0;
   
   
    public static void main(String[] args)
    {
               int check = 0;
           
               String s_element_string="", e_element_string="", textnode_string="";
        File file = new File("C:/Users/anousha work/Downloads/XML ASSIGNMENT(1)/XML ASSIGNMENT/STUDENTS.xml");
       
        if (!file.exists())
        {
          System.out.println("File does not exist.");
          return;
        }
       
        else if (!(file.isFile() && file.canRead()))
        {
          System.out.println("File cannot be read from.");
          return;
        }
        else
        {
        try
       {
          FileInputStream myfile = new FileInputStream(file);
          char current,nextchar;
              int content;
             
          while ((content = myfile.read()) != -1)
          {
            current = (char) content;
               
               
                if (current == '<')
                {
                    nextchar=(char) myfile.read();
                   if (nextchar != '?')
                   {
                      textnode_string=textnode_string.trim();
                      
                       if (textnode_string.length()!=0)
                        {
                            System.out.println("------> text value: " +textnode_string);
                        }
                      
                        textnode_string ="";
                       if (nextchar != '/')
                       {
                              check = 1;
                              s_element_string= s_element_string + nextchar;
                        }
                       else
                       {
                           
                           check = 2;
                       }
                    
                         
                      
                         
                    }
                   
                   
                }
               
               
               
                if (current == '>')
                {
                   
                    if (s_element_string.length()!=0)
                    {
                     System.out.println("Start element: " +s_element_string);
                    }
                   
                      if (e_element_string.length()!=0)
                    {
                     System.out.println("End element: " +e_element_string);
                    }
                            s_element_string ="";
                           
                           
                            e_element_string= "";
                           
                           
                           
                   nextchar=(char) myfile.read();
                   if (nextchar != '<')
                   {
                       textnode_string = textnode_string + nextchar;
                       check = 3;
                   }
                           
                           
                }
               
                if (check==1 )
                {
                    if (current != '<')
                    {
               
                        s_element_string=s_element_string + current;
                    }
                }
               
                if (check==2)
                {
                    if (current != '<')
                    {
                       
                        if (current != '/')
                        {
               
                            e_element_string=e_element_string + current;
                        }
                    }
                }
               
               
                if (check==3)
                {
                    if (current != '>')
                    {
                        textnode_string = textnode_string + current;
                    }
                }
         
         }
           }
       
            catch (IOException e)
       {
          e.printStackTrace();
        }
      }

   
    }
}
