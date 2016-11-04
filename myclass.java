class myclass1 extends Thread 
{
	public void run()
	{
	for(int i=0;i<10;i++)
	{
	System.out.println(i);
	
	try {
		Thread.sleep(100);
	} catch (InterruptedException e)
	{
		System.out.println(Thread.currentThread().getId());
	}
	}
}



public static void main(String[] args)
{
myclass1 a = new myclass1();
myclass1 b = new myclass1();
a.start();
b.start();
}

}
