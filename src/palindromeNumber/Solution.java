package palindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
		int div = 1;
		if (x < 0)
			return false;

		while (x / div >= 10)
			div *= 10;

		while (x > 0) {
			int last = x / div;
			int reminder = x % 10;

			if (last != reminder) {
				return false;
			}
			x = x % div / 10; // 这个公式：求余同位数再除以10是去掉第一位和最后一位的数字
			div /= 100;

		}

		return true;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPalindrome(13431));
	}
}
