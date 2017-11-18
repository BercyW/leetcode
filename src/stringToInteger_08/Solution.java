package stringToInteger_08;

public class Solution {
	public int myAtoi(String str) {
		int result = 0;
		String temp = "";
		int index = 1;
		// 检验是不是空
		if (str.isEmpty()) {
			return 0;
		}

		str = str.trim();// 去空格

		char[] array = str.toCharArray();// 编程数组就不需要用charAt了

		boolean sign = true;
		if (array[0] == '-') {
			sign = false;
		}
		/*
		 * 检查个位数
		 */

		if (str.length() == 1 && array[0] >= '0' && array[0] <= '9') {
			result = Integer.parseInt(str);
		} else if (str.length() == 2 && (array[0] == '+' || array[0] == '-') && (array[1] >= '0' && array[1] <= '9')) {
			temp = str.substring(0, 2);
			return result = Integer.parseInt(temp);
		} else if ((array[0] >= '0' && array[0] <= '9') && !(array[1] >= '0' && array[1] <= '9')) {
			temp = str.substring(0, 1);
		//	System.out.println(temp);
			return result = Integer.parseInt(temp);

		}
		for (int i = 1; i < array.length; i++) {

			if (array[0] == '+' || array[0] == '-') { // 判断数字前是不是有+ —号
				if (array[i] >= '0' && array[i] <= '9') { // 用index来截取字符串
					index++;

				} else if (index != str.length()) {
					break;
				} else {
					return 0;
				}

			} else if (array[0] >= '0' && array[0] <= '9') { // 如果没有+-号

				if (array[i] >= '0' && array[i] <= '9') { // 判断是不是数字
					index++;

				} else if (index != str.length()) {
					break;
				}

			} else if (index == 1) { // 如果index等于1说明+—后边都不是数字

				return 0;
			}
		}
		// 截取字符串
		if (index > 1) {
			temp = str.substring(0, index);
			try {
				result = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				if (sign) {
					return Integer.MAX_VALUE;
				} else {
					return Integer.MIN_VALUE;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.myAtoi("-12aw2"));
		// s.myAtoi("-123");
	}

}