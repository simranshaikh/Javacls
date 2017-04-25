package Multithreading;

public class MyThread extends Thread 
{
	public MyThread()
	{
		
	}
	@Override
	public void run() {
		System.out.println("hellooooo.....");
	}
	
	public static void  main(String[] args) 
	{
		MyThread m=new MyThread();
		m.setName("t1");
		m.start();
		m.setPriority(Thread.NORM_PRIORITY);
		System.out.println(m.getPriority());
	}
}
