package zigzag_06;

public class Solution {
	public String convert(String s, int numRows) {

		int circle = numRows + (numRows - 2);
		String b = "";
		
		if(numRows==1||numRows==0) return s;
		
		
		int index1 = 0;
		for (int i = 0; i < numRows; i++) {

			for (int j = i; j < s.length(); j += circle) {

				b += s.charAt(j);

				if (i > 0 && i < numRows - 1) {

					index1 = circle - (2 * i) + j;

					if (index1 < s.length()) {
						b += s.charAt(index1);
					}

				}

			}
		}

		return b;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String s1 = "PAYPALISHIRING";
	
	System.out.println(	s.convert(s1, 4));
	}

}
