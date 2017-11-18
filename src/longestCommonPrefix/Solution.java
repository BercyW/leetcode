package longestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		 int[] l = new int[strs.length];
			if (strs.length == 0)
				return "";
			if (strs.length == 1)
				return strs[0];
			if (strs.length == 1 && strs[0] == "")
				return "";

			// find min length of the string
			for (int i = 0; i < strs.length; i++) {
				l[i] = strs[i].length();
			}
			int temp = 0;

			for (int i = 0; i < l.length; i++) {
				for (int j = i + 1; j < l.length; j++) {
					if (l[i] > l[j]) {
						temp = l[i];
						l[i] = l[j];
						l[j] = temp;
					}
				}
			}
			int min = l[0]; // get the min length
			String result = "";
			boolean flag = false;

			for (int i = 0; i < min; i++) {
				for (int j = 0; j < l.length; j++) {

					if (!((strs[0].charAt(i) + "").equals(strs[j].charAt(i) + ""))) {
						result = strs[0].substring(0, i);

						i = min - 1;
						break;
					} else {
						result = strs[0].substring(0, min);

					}

				}

			}

			return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] str = { "a","a","b" };

		System.out.println(s.longestCommonPrefix(str));
		
		
	}
}
