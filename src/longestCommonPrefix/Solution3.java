package longestCommonPrefix;

import java.util.Arrays;

public class Solution3 {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0 || strs == null)
			return "";
		int[] len = new int[strs.length];
		for (int i = 0; i < len.length; i++) {
			len[i] = strs[i].length();
		}
		Arrays.sort(len);
		int nLen = len[0];
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while (i < nLen) {

			for (int j = 0; j < len.length; j++) {
				if (strs[0].charAt(i) != strs[j].charAt(i)) {

					return sb.toString();
				}
			}
			sb.append(strs[i]);
			i++;
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Solution3 s3 = new Solution3();
		String[] str = { "a","a","b"};

		System.out.println(s3.longestCommonPrefix(str));

	}
}
