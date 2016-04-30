
public class ThreadOutput implements Runnable
{
 public void run()
 {
  for(int i=0;i<3;i++)
  {
      System.out.println(i);
  }
 }
 public static void main(String[]args)
 {
     (new Thread(new ThreadOutput())).start();
        new Thread( new ThreadOutput()).start();
        System.out.println("Done");
 }
}
