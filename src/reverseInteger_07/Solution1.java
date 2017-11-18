package reverseInteger_07;

public class Solution1 {
	public int reverse(int x) {
		if(x==Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		
		int result = 0;
		int num = Math.abs(x);
		
		while (num != 0) {
			if (result > (Integer.MAX_VALUE - num % 10) / 10) {
				return x > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			result = result * 10 + num % 10;
			num /= 10;
			
		}

		return x>0?result:-result;
	}

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		System.out.println(s1.reverse(100));
	}
}
