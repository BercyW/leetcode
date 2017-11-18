package plusOne66;
/*
 *   思路1：让最后一位不等于9 就加1；
 *  		2：其他情况就等于0；
 *   	3：如果第一位等于0，就说明都是9，所以新建一个长一位的数组，放到新数组里。
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] digits = { 9, 9 };
		int[] newD = s.plusOne(digits);

		for (int i = 0; i < newD.length; i++) {
			System.out.println(newD[i]);
		}

	}

	public int[] plusOne(int[] digits) {
		int[] newDigits = null;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		if (digits[0] == 0) {

			newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			for (int j = 1; j < newDigits.length; j++) {
				newDigits[j] = digits[j - 1];
			}
		}

		return newDigits;
	}
}
