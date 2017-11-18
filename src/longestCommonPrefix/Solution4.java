package longestCommonPrefix;

public class Solution4 {
	public String longestCommonPrefic(String[] strs) {
		if (strs.length == 0 || strs == null)
			return "";

		for (int i = 0; i < strs[0].length(); i++) {
			char x = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != x || strs[j].length() == i) {
					return strs[0].substring(0, i);
				}

			}

		}

		return strs[0];
	}
}
