class himanboss implements Runnable
{
  @Override
  public void run()
  {
    int c=0;  
    try
    {
      while(true)
      {
        System.out.println(c+" seconds");   
        Thread.sleep(1000);
        ++c;
        c=c%60;
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Error");  
    }
  }
}

class jerinboss implements Runnable
{
  @Override
  public void run()
  {
    int c=0;  
    try
    {
      while(true)
      {
        System.out.println(c+" minutes");   
        Thread.sleep(60000);
        ++c;
        c=c%60;
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Error");  
    }      
  }
}

class amanboss implements Runnable
{
  @Override
  public void run()
  {
    int c=0;  
    try
    {
      while(true)
      {
        System.out.println(c+" hours");   
        Thread.sleep(3600000);
        ++c;
        c=c%24;
      }
    }
    catch(InterruptedException e)
    {
      System.out.println("Error");  
    }  
  }
}

public class Ikesh
{
  public static void main(String args[])
  {
    Thread t1=new Thread(new himanboss());
    Thread t2=new Thread(new jerinboss());
    Thread t3=new Thread(new amanboss());
    
    t1.start();
    t2.start();
    t3.start();
    
    try
    {
      t1.join();
      t2.join();
      t3.join();
    }
    catch(InterruptedException e)
    {
      System.out.println("Error");  
    }
  } 
}