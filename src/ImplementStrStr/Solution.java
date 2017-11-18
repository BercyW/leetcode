package ImplementStrStr;

public class Solution {
	public int kmp(String haystack, String needle) {

		int hLen = haystack.length();
		int nLen = needle.length();
		if (hLen == 0 && nLen == 0)
			return 0;
		if (hLen == 0 || nLen == 0)
			return -1;

		int i = 0;
		int j = 0;
		int[] arrayNeedle = new int[nLen];
		getArrayNeedle(needle, arrayNeedle);

		while (i < hLen && j < nLen) {
			if (haystack.charAt(i) == needle.charAt(j)) {
				i++;
				j++;
			} else {
				if (arrayNeedle[j] == -1) {
					i++;
					j = 0;
				} else {
					j = arrayNeedle[j];
				}
			}
			if (j == needle.length()) {
				return i - j;
			}
		}
		return -1;

	}

	public void getArrayNeedle(String needle, int[] arrayNeedle) {

		int k = -1;
		int j = 0;
		arrayNeedle[0] = -1;
		while (j < needle.length() - 1) {
			if (k == -1 || needle.charAt(k) == needle.charAt(j)) {
				k++;
				j++;
				arrayNeedle[j] = k;
			} else {
				k = arrayNeedle[k];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution kmp = new Solution();
		String str = "addfadfdfadfc";
		String pattern = "dfadfc";
		System.out.println(kmp.kmp(str, pattern));
	}
}
