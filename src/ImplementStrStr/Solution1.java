package ImplementStrStr;

public class Solution1 {
	public int kmp(String haystack, String needle) {
		int hLen = haystack.length();
		int nLen = needle.length();
		int i = 0;
		int j = 0;
		if(hLen == 0 && nLen == 0) return 0;
		if(hLen==0 || nLen == 0) return -1;
		int[] arrayNeedle = new int[nLen];
		getNeedleArray(needle,arrayNeedle);
		while(i<hLen && j < nLen) {
			
		}
		
		
		
		return -1;
	}
	public void getNeedleArray(String needle, int[] arrayNeedle) {
		int i = 0;
		int k = -1;
		arrayNeedle[0] = -1;
		while(i<needle.length()-1) {
			if(k==-1 || needle.charAt(i)==needle.charAt(k)){
				i++;
				k++;
				arrayNeedle[i] = k;
			}else {
				
			}
		}
			
			
			
	
	}
}
