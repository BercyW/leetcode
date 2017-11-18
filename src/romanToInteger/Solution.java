package romanToInteger;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Solution {

	public int romanToInt(String s) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("I", 1);
		hm.put("V", 5);
		hm.put("X", 10);
		hm.put("L", 50);
		hm.put("C", 100);
		hm.put("D", 500);
		hm.put("M", 1000);
		
		int num1 = hm.get(s.charAt(s.length()-1)+"");
	
		
		
		int[] a = new int[s.length()];
	
		if (s.length() <= 1) {
			return hm.get(s);
		}
		for (int i = 0; i < s.length(); i++) {
			a[i] = hm.get(s.charAt(i)+"");
			
		}
		
		for (int i = s.length()-1; i >= 0; i--) {
			if(i==0) {
				break;
			}
			
			if(a[i]>a[i-1]) {
				num1 = a[i]-a[i-1]+num1-a[i];
				
			}else if(a[i] <= a[i-1]) {
				num1 = a[i-1]+num1; 
			}
		}
	
		return num1;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.romanToInt("XVIII"));
	}

}
