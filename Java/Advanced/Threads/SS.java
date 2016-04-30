class SS extends Thread
{
  static String msg[]={"This", "is", "a", "synchronized", "variable"};
  
  //constructor
  SS(String threadname)
  {
    super(threadname);
  }
  
  //run method
  public void run()
  {
    display(getName());
  }
  
  //method display // //here it is Syn Statement
  public void display(String threadN)
  {

    synchronized(this)
    {
        for(int i=0;i<=4;i++)
        System.out.println(threadN+msg[i]);

        try
        {
            this.sleep(1000);
        }

        catch(Exception e){}
    }
  }
  
    public static void main(String[] args)
    {
            SS t1=new SS("Thread One: ");
            t1.start();
            SS t2=new SS("Thread Two: ");
            t2.start();
    }
}
 

