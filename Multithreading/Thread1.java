package Multithreading;

public class Thread1 implements Runnable {

	@Override
	public void run() 
	{
		System.out.println("hi.....helloooooo......");
	}
	public static void main(String[] args) {
		Runnable t=new Thread1();
		Thread t1=new Thread(t,"t");
		//ORRRRR..........    t1.setName("t");
		t1.start();
	}
}
