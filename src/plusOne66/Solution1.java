package plusOne66;

public class Solution1 {
	public static void main(String[] args) {

		Solution1 s1 = new Solution1();
		int[] digits = {8,3};
		int[] newD = s1.plusOne(digits);
		for (int i = 0; i < newD.length; i++) {
			System.out.println(newD[i]);
		}

	}

	public int[] plusOne(int[] digits) {
		if (digits.length == 0)
			return digits;
		int len = digits.length;
		int[] po = null;
		int count = 0;
		int i = 1;

		while (len >= i && digits[len - i] == 9) {
			i++;
			count++;
		}

		if (count == len) {
			po = new int[len + 1];
			for (int j = 0; j < count; j++) {
				po[len - j] = 0;
			}
			po[0] = 1;
		} else if (count < len && count != 0) {
			for (int j = 0; j < count; j++) {
				digits[len - 1 - j] = 0;
			}
			digits[len - count - 1] = digits[len - count - 1] + 1;
			return digits;

		}else {
			digits[len-1] = digits[len-1]+1; 
			return digits;
		}
		
		return po;
	}

}
