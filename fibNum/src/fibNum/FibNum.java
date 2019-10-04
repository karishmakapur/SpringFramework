package fibNum;

public class FibNum {
	public static void main(String args[])
	{
		int fib = 8;
		int val = fibNum(fib);
		System.out.println(val );
	}

	private static int fibNum(int fib) {
		int prev = 0;
		int curr = 1;
		int next = 0;
		int counter = 1;
		while(counter < fib)
		{
			counter++;
			next = prev + curr;
			prev = curr;
			curr = next;
		}
		return curr;
	}
}
