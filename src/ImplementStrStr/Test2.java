package ImplementStrStr;

public class Test2 {
	public static void main(String[] args) {
		String needle = "abcwefefabc";
		int[] arrayNeedle = new int[needle.length()];
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
		for (int i = 0; i < arrayNeedle.length; i++) {
			System.out.print(arrayNeedle[i]+",");	
		}
		
		
	}
}
