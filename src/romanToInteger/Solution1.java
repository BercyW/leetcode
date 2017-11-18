package romanToInteger;

import java.util.HashMap;

public class Solution1 {
	public int romanToInt(String s) {
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		hs.put('I', 1);
		hs.put('V', 5);
		hs.put('X', 10);
		hs.put('L', 50);
		hs.put('C', 100);
		hs.put('D', 500);
		hs.put('M', 1000);
		
		int num = hs.get(s.charAt(s.length()-1));
		int len = s.length() - 1;
	
			for (int j = s.length() - 2; j >= 0; j--) {
				if (len>=0 && hs.get(s.charAt(len)) <= hs.get(s.charAt(j))) {
					num = num+hs.get(s.charAt(j));
					len--;
				} else if (len>=0 && hs.get(s.charAt(len)) > hs.get(s.charAt(j))){
					num = num-hs.get(s.charAt(j));
					len--;
				}
			}
		
		return num;
	}

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		System.out.println(s1.romanToInt("X"));
	}
}
