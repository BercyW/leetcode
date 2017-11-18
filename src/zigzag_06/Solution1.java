package zigzag_06;

public class Solution1 {
	public String convert(String s, int numRows) {
		if (s.length() == 0 || s == null)
			return "";
		if (s.length() == 1)
			return s;
		StringBuilder sb = new StringBuilder();
		int distance = 2*numRows-2;
		
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < s.length(); j+=distance) {
				sb.append(s.charAt(j));
				if(i!=0 && i!=numRows-1) {
					int tmp = j+distance-2*i;
					sb.append(s.charAt(tmp));
				}
			}
		}
		
		
		
		
		
		
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s1 = "PAYPALISHIRING";

		System.out.println(s.convert(s1, 3));
	}
}
