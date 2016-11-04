class a implements Runnable 
{
	public void run()
	{

for(int i=0;i<10;i++)
{
	System.out.println(i);
try{
	Thread.sleep(100);
}
catch(Exception e)
{
	//timepass
}
}


	}
public static void main(String[] arg)
{
Thread a1 = new Thread(new a());
Thread b = new Thread(new a());
a1.start();
b.start();
b.stop();
}




}