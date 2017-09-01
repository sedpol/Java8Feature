package tr.com.sedatpolat.Java8Feature.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sedpol
 *
 */
public class Tester {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		int i = 0;
		while (i < 100) {
			list.add(i++);
		}
		System.out.println(list.parallelStream().anyMatch(x -> x < 89));
		System.out.println(list.parallelStream().allMatch(x -> x < 100));
		System.out.println(list.parallelStream().noneMatch(x -> x > 100));
		System.out.println(list.parallelStream().filter(x -> x > 11 && x % 3 == 0).findAny());

		list.removeIf(val -> val % 2 == 0);

		
	}

}
