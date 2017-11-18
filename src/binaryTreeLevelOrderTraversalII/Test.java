package binaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(0, 1);
	list.add(0,2);
	list.add(0,3);
	Iterator<Integer> it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}
}
