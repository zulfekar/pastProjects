
public class Test2 extends Thread
{
    public void run()
    {
        System.out.println("Test2");
    }
    public static void main(String[]args)
    {
        new Test2().start();
    }
    
}
