package addBinary67;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.addBinary("11", "1"));
		
	}

	public String addBinary(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int carry = 0;
		String s = "";
		int maxLen = Math.max(aLen, bLen);

		for (int i = 0; i < maxLen; i++) {
			int p = 0;
			int q = 0;

			if (i < aLen) {
			
				p = a.charAt(aLen - 1 - i) - '0';
		

			} else {
				p = 0;
			}
			if (i < bLen) {
				q = b.charAt(bLen - 1 - i) - '0';
			} else {
				q = 0;
			}
			int tmp = p + q + carry;  //
			carry = tmp / 2; 
			s = tmp % 2 + s;

		}

		return (carry==0)?s : "1"+s;
	}
}
