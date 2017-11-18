package findTheDifference;

public class Solution {
	public char findTheDifference(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		char temp;
		for (int i = 0; i < sChar.length; i++) {
			for (int j = i; j < tChar.length; j++) {
				if( sChar[i]==tChar[j]) {
					temp = tChar[j];
					tChar[j]=tChar[i];
					tChar[i] = temp;
				}
			}
		}
		
		
		return tChar[t.length()-1];
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String a = "";
		String b = "a";
		System.out.println(s.findTheDifference(a, b));
	}
}
