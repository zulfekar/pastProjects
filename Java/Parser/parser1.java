import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class parserxml
{
    static String message="";
    static String value ="",value2="",value3="";
    static int counterOpening = 0;
    static int counterClosing = 0;
   
   
    public static void main(String[] args)
    {
               int check = 0;
               String all="";
               int counter = 0;
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
          char current,current1;
              int val;
          while ((val =myfile.read()) != -1)
          {
            current = (char) val;
                //System.out.println("eee"+current);
            all = all + current;
                //System.out.println("current"+current);
               
                  if (check == 2)
                  {
                      if (current !='<')
                      {
                          check = 3;
                      }
                      else
                      {
                          check = 0;
                         
                      }
                  } 
            if (check ==0)
            {
                  
                    check = 0;
                    counter = counter + 1;
                  
                //current = (char) myfile.read();
                       
                if (current =='/')
                {
                           
                    message = "";
                    message = "closing tag is: ";
                   
                    while(!(current=='>'))
                    {
                        value += current;
                        current = (char) myfile.read();


                    }
                    System.out.println(message + value);
                    counterClosing ++;
                    value = "";
                       
                           
                }
                else if (!(current =='/'))
                {
                    message = "";
                    message = "Opening tag is: ";
                               
                                     if (current =='?' )
                   
                                    {
                   
                   
                                            check = 1;
                                    }
                                    if (check !=1)
                                    {
                    while(!(current =='>'))
                    {
                                    value += current;
                                    current = (char) myfile.read();


                       
                                  }
                                    System.out.println (message + value);
                                    counterOpening ++;
                                    value = "";
                                    current = (char) myfile.read();
                                    }
                                      

                }
                   
               check = 2;
                       value=Character.toString(current);
            }
               
                 
                 
         
                if (current == '>')
                {
                    check = 2;
                    value=Character.toString(current);
                 
                }
                
               
             
                 
              
                  if (check ==3)
                    {
                        message = "";
                        message = "Text is: ";
                       
                                   
                               
                        while(!(current == '<'))
                                           
                                        {
                                          
                                        
                            value += current;
                            current = (char) myfile.read();
                                            }
                   
                                        value=value.trim();
                                       
                                       
                                       
                                        if (!value.equals(">"))
                                        {
                                            if (!value.equals(""))
                                        {
                                            System.out.println (message + value);
                                        }
                                          
                                        }
                                       
                                        value="";
                                        check = 0;
                    }
          
        }
            }catch (IOException e)
        {
          e.printStackTrace();
        }
      }

        System.out.println("Total number of opening tags: " + (counterOpening-1));
        System.out.println("Total number of closing tags: " + counterClosing);
       
  
    }
}

