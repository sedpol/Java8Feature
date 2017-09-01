package tr.com.sedatpolat.Java8Feature.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * 
 * @author sedpol
 *
 */
public class Tester2 {

	private static List<Integer> intList = new ArrayList<Integer>();

	public static void main(String[] args) {

		IntStream.range(0, 101).parallel().forEach(new IntConsumer() {

			@Override
			public void accept(int value) {
				add(value);
			}
		});

		Integer i = intList.stream().parallel()
									.filter(Tester2::isOdd) // or index->isOdd(index);
									.filter(index->isOdd(index)) // or Tester2::isOdd
									.max(Comparator.naturalOrder())
									.map(index -> index * index)
									.get();

		System.out.println("square of max number in the list: " + i);
	}

	private static synchronized void add(int val) {
		intList.add(val);
	}

	private static boolean isOdd(int i) {
		return i % 2 == 1;
	}
}
