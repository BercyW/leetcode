package plusOne66;

public class Solution2 {

	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
		int[] digits = { 9, 9 };
		int[] newD = s2.plusOne(digits);

		for (int i = 0; i < newD.length; i++) {
			System.out.println(newD[i]);
		}

	}
	public int[] plusOne(int[] digits) {
		int[] newD = null;
		int len = digits.length;
		for (int i = 0; i < digits.length; i++) {
			if(digits[len-1-i]<9) {
				digits[len-i-1]++;
				return digits;
			}else {
				digits[len-1-i] = 0;
			}
		}
		if(digits[0]==0) {
			newD = new int[len+1];
			newD[0]=1;
			for (int i = 1; i < newD.length; i++) {
				newD[i] = digits[i-1];
			}
		}
		return newD;
	}
}
