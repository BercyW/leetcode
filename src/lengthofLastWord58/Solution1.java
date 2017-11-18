package lengthofLastWord58;

public class Solution1 {
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		System.out.println(s1.lengthOfLastWord(" "));
	}

	public int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0)
			return 0;

		int len = 0;
		int i = 0;
		while (s.charAt(s.length() - i-1) == ' ') {
			i++;
			if(i==s.length()) return 0;
		}
		while (s.length() - i-1 >= 0 && s.charAt(s.length() - i-1) != ' ') {
			i++;
			len++;
		}

		return len;
	}
}
