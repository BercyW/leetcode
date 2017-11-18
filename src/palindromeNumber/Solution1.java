package palindromeNumber;

public class Solution1 {
	public boolean isPalindrome(int x) {
		int div = 1;
		if(x<0) return false;
		
		while (x / div >= 10) {
			div *= 10;
		}

		while (x > 0) {
			int front = x / div;
			int last = x % 10;

			if (front != last) {
				return false;
			}

			x = x % div / 10;
			div /= 100;

		}

		return true;
	}

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		System.out.println(s1.isPalindrome(13431));
	}
}
