package findLeftMostElement;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int[] abc = new int[list.size()];
		
			abc= (int[]) list.toArray()[0];
		
		
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
	}
	
}
