package stringToInteger_08;

public class Solution2 {
	public int myAtoi(String str) {
		if (str.length() < 1 || str == null)
			return 0;

		int result = 0;
		str.trim();

		char flag = '+';
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}

		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			if (result > Integer.MAX_VALUE / 10
					|| (result == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < str.charAt(i) - '0'))
				return flag == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;

			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}

		if (flag == '-') {
			return result = -result;
		}

		return result;
	}

	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
		System.out.println(s2.myAtoi("-12a"));
	}
}
