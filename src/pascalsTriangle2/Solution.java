package pascalsTriangle2;

import java.util.*;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		
		List<Integer> list = new ArrayList<Integer>();
	
		
		for (int i = 0; i < rowIndex+1; i++) {
			list.add(0, 1);
			for (int j = 1; j < list.size()-1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
			new ArrayList<Integer>(list);
		}

		return list;
	}

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.getRow(0));
	}
}
