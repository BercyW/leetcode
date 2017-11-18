package longestCommonPrefix;

public class Solution2 {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0 || strs == null)
			return "";

		for (int i = 0; i < strs[0].length(); i++) {
			char x = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].length() == i || strs[j].charAt(i) != x)
					return strs[0].substring(0, i);
			}
		}

		return strs[0];
	}
	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
		String[] str = { "a"};

		System.out.println(s2.longestCommonPrefix(str));

	}
}
