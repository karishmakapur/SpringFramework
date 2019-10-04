
public class main {

	public static void main(String[] args) {
		ThreadEx1 thread1 = new ThreadEx1();
		ThreadEx2 thread2 = new ThreadEx2();
		
		thread1.start();
		thread2.start();
	}

}
