package hammingDistance;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.hammingDistance(2, 5));
	}

	public int hammingDistance(int x, int y) {
		int distance = 0;

		String a = Integer.toBinaryString(x);
		String b = Integer.toBinaryString(y);

		int alen = a.length();
		int blen = b.length();
		int maxlen = Math.max(alen, blen);

		if (alen > blen) {
			for (int i = 0; i < alen - blen; i++) {
				b = "0" + b;
			}

		}
		if (alen < blen) {
			for (int i = 0; i < blen - alen; i++) {
				a = "0" + a;
			}

		}

		if (a.length() == b.length()) {
			for (int i = 0; i < maxlen; i++) {
				if (a.charAt(i) == (b.charAt(i))) {
					continue;
				} else {
					distance++;
				}
			}
		}

		return distance;

	}
}
