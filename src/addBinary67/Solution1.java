package addBinary67;

public class Solution1 {
	public static void main(String[] args) {
		String a = "11";
		String b = "1";

		Solution1 s1 = new Solution1();
		System.out.println(s1.addBinary(a, b));
	}

	public String addBinary(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int maxLen = Math.max(aLen, bLen);
		String s = "";
		int carry = 0;
		for (int i = 0; i < maxLen; i++) {
			int p = 0;
			int q = 0;
			if (i < aLen) {
				p = a.charAt(aLen - i - 1) - '0';
			} else {
				p = 0;
			}
			if (i < bLen) {
				q = b.charAt(bLen - i - 1) - '0';
			} else {
				q = 0;
			}
			int tmp = p + q + carry;
			carry = tmp / 2;
			s = tmp%2+s;
			
		}

		return carry==0? s : '1'+s;
	}

}
