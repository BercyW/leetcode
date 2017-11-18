package integerToRoman;

import java.util.HashMap;

public class Solution {

	public String intToRoman(int num) {
		String str = "";

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "I");
		hm.put(4, "IV");
		hm.put(5, "V");
		hm.put(9, "IX");
		hm.put(10, "X");
		hm.put(40, "XL");
		hm.put(50, "L");
		hm.put(90, "XC");
		hm.put(100, "C");
		hm.put(400, "CD");
		hm.put(500, "D");
		hm.put(900, "CM");
		hm.put(1000, "M");

		// 12 XII 18XVIII 42 xlii 922 CMXXII
		if (hm.get(num) != null) {
			str = hm.get(num);
			return str;
		}
		if (num > 1000) {
			return "M" + intToRoman(num - 1000);
		}

		if (num > 900) {
			return "CM" + intToRoman(num - 900);
		}
		if (num > 500) {
			return "D" + intToRoman(num - 500);
		}
		if (num > 400) {
			return "CD" + intToRoman(num - 400);
		}
		if (num > 100) {
			return "C" + intToRoman(num - 100);
		}

		if (num > 90) {
			return "XC" + intToRoman(num - 90);
		}
		if (num > 50) {
			return "L" + intToRoman(num - 50);
		}
		if (num > 40) {
			return "XL" + intToRoman(num - 40);
		}

		if (num > 10) {
			return "X" + intToRoman(num - 10);
		}

		if (num > 5) {
			return "V" + intToRoman(num - 5);
		}
		if (num >= 1) {
			return "I" + intToRoman(num - 1);
		}

		return "";
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.intToRoman(6));
	}
}
