
public class ThreadEx2 extends Thread {
	
	public void run()
	{
		for(int i = 1001; i < 2000; i++)
		{
			System.out.println("Thread 2 " + i );
		}
	}

}
