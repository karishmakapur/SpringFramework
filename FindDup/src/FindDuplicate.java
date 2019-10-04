

public class FindDuplicate {

	public static void main(String[] args)
	{	
		Integer array[] = new Integer[] {1,2,3,4,5,6,6,7,8,9,10};
		
		int actualSum = 0;
		for(int i = 0; i < array.length; i++)
		{
			actualSum += array[i];
		}
		
		int expectedSum = 0;
		for(int i = 1; i <= 10; i++)
		{
			expectedSum += i;
		}
		System.out.println(actualSum);
		System.out.println(expectedSum);
		System.out.println("The duplicate number is " + abs(expectedSum - actualSum));
			
		
	}

	private static int abs(int i) {
		if(i < 0)
		{
			return (i * -1);
		}
		else
		{
			return i;
		}
	}
}
