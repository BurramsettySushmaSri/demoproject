 class A extends Thread
{
    public void run()
    {
        
          for(int i=0;i<10;i++)  
        {
        System.out.println("hi");
    }
    }
}
class Test
{
    public static void main(String args[])
    {
       A ob= new A();
       ob.start();
    }
}