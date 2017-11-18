package longestCommonPrefix;

import java.util.Arrays;

public class Solution1 {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		
		int[] minLenArray = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			minLenArray[i] = strs[i].length(); // string 每一个长度放到数组里
		}
		Arrays.sort(minLenArray); // 找到最短的string
		int minLen = minLenArray[0];
		int i = 0;
		StringBuilder sb = new StringBuilder();

		while (i < minLen) {
			for (int j = 1; j < minLenArray.length; j++) {
				if (strs[0].charAt(i) != strs[j].charAt(i)) {

					return sb.toString();
				}
			}
			sb.append(strs[0].charAt(i));
			i++;
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		String[] str = { "a"};

		System.out.println(s1.longestCommonPrefix(str));

	}
}
