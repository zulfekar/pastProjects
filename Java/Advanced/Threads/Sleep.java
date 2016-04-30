
public class Sleep 
{
    public static void main(String[]args) throws InterruptedException
    {
        String info[]={"A","B","C","D"};
        for(int i = 0 ; i<info.length;i++)
        {
            Thread.sleep(2000);
            System.out.println(info[i]);
        }
    }
}
