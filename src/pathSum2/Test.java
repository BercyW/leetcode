package pathSum2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<List<Integer>> res1 = new ArrayList<List<Integer>>();
		List<Integer> value1 = new ArrayList<Integer>();
		value1.add(1);
		value1.add(2);
		value1.add(3);
		value1.add(4);
		value1.add(5);
		
		res1.add(new ArrayList<Integer>(value1));
		System.out.println(res1);
	}
}
