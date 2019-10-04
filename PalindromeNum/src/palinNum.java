
public class palinNum {

	public static void main(String[] args) {
		
		int num = 1;
		boolean isPalindrome = palindrome(num);
		if(isPalindrome == true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

	private static boolean palindrome(int num) {
		int newNum = num;
		String reverseNum = "";
		
		while(newNum != 0)
		{
			reverseNum += newNum % 10;
			newNum = newNum / 10;
		}
		int revNum = Integer.parseInt(reverseNum);
		
		if(revNum == num)
		{
			return true;
		}
		return false;
	}

}
