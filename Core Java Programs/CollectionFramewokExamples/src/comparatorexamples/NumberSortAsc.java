package comparatorexamples;

import java.util.Comparator;

public class NumberSortAsc implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1-o2;
	}
}
