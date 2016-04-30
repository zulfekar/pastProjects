class Share extends Thread{
  static String msg[]={"This", "is", "a", "synchronized", "variable"};
 
  //constructor
  Share(String threadname){
  super(threadname);
  }
  
  //run method
  public void run(){
  display(getName());
  }
  
  //display method - synchronized//here it is SM
  public synchronized void display(String threadN){
  for(int i=0;i<=4;i++)
  System.out.println(threadN+msg[i]);
  try{
  this.sleep(1000);
  }
  catch(Exception e){}
  }
}

public class SynThread1 {
  public static void main(String[] args) {
  Share t1=new Share("Thread One: ");
  t1.start();
  Share t2=new Share("Thread Two: ");
  t2.start();
}
}