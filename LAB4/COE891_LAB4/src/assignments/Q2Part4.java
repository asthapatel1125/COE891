package assignments;

public class Q2Part4 {
	public static boolean isPalindrome(String s) {
		if (s == null)
			throw new NullPointerException();
		int left = 0;
		int right = s.length() - 1;
		boolean result = true;
		while (left < right && result == true)
		{
			if (s.charAt(left) != s.charAt(right))
			{result = false;}

			left++;
			right--;
		}
		return result;
	}
}
