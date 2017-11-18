package validParentheses;

import java.util.LinkedList;

public class Solution {
	public boolean isValid(String s) {
		if (s == null || s.length()==1)
			return false;
		if (s.length() % 2 != 0) 
			return false;
		
		LinkedList<Character> list = new LinkedList<Character>();
			
		for(char ch : s.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				list.add(ch);
			}else if(ch==')') {
				
				if(list.isEmpty()||list.getLast()!='(') {
					return false;
				}else {
					list.removeLast();
				}	
			}else if(ch==']') {
				
				if(list.isEmpty()||list.getLast()!='[') {
					return false;
				}else {
					list.removeLast();
				}
			}else if(ch=='}') {
					
					if(list.isEmpty()||list.getLast()!='{') {
						return false;
					}else {
						list.removeLast();
					}		
	
		}
	}	
		return list.isEmpty();

	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isValid("{([)]}"));

	}
}
