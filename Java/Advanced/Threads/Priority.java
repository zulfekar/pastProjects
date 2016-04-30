class Thread1 extends Thread
{
    public Thread1(String s)
    {
        super(s);
        start();
    }
    public void run()
    {
        for (int i =0;i<3;i++)
        {
            Thread cur = Thread.currentThread();
            cur.setPriority(Thread.MIN_PRIORITY);
            int p = cur.getPriority();
            System.out.println("Thread Name:"+Thread.currentThread().getName());
            System.out.println("Thread Priority:"+cur);
        }
        
    }
}

class Thread2 extends Thread
{
    public Thread2(String s)
    {
        super(s);
        start();
    }
    public void run()
    {
        for (int i =0;i<3;i++)
        {
            Thread cur = Thread.currentThread();
            cur.setPriority(Thread.MAX_PRIORITY);
            int p = cur.getPriority();
            System.out.println("Thread Name:"+Thread.currentThread().getName());
            System.out.println("Thread Priority:"+cur);
        }
        
    }
}













public class Priority 
{
    public static void main(String[]args)
    {
        Thread1 m1 = new Thread1("My Thread 1");
         Thread2 m2 = new Thread2("My Thread 2");
      
         
    }
}
