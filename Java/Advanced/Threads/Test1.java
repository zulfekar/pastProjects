
public class Test1 implements Runnable
{
    public void run()
    {
        System.out.println("Test1");
    }
    
    public static void main(String[]args)
    {
        (new Thread(new Test1())).start();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
