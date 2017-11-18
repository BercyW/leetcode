package integerToRoman;

import java.util.HashMap;

public class Solution1 {
	public String intToRoman(int num) {
		int[] numArray = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanArray = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder sb = new StringBuilder();

		while (num != 0) {
			for (int i = 0; i < numArray.length; i++) {
				if (num >= numArray[i]) {
					sb.append(romanArray[i]);
					num = num - numArray[i];
					break;
				}
			}
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		System.out.println(s1.intToRoman(20));
	}
}
