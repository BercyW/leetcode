package ImplementStrStr;

public class Test {
	public static void main(String[] args) {
		
		String needle = "abcwefefabc";
		int[] next = new int[needle.length()];
		next[0] = 0;

		for (int i = 1; i < needle.length(); i++) {
			int index = next[i - 1];
			while (index > 0 && needle.charAt(index) != needle.charAt(i)) {
				index = next[index - 1];
			}

			if (needle.charAt(index) == needle.charAt(i)) {
				next[i] = next[i - 1] + 1;
			} else {
				next[i] = 0;
			}
		}
	     for (int i = 0; i < next.length; i++) {
			System.out.print(next[i]+",");
		}   
	}
		
}
