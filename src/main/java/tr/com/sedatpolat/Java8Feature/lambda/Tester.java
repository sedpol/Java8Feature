package tr.com.sedatpolat.Java8Feature.lambda;

import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/**
 * 
 * @author sedpol
 *
 */
public class Tester {
	public static void main(String[] args) {

		long s_time = System.currentTimeMillis();
		System.out.println(isPrime(Integer.MAX_VALUE));
		System.out.println(System.currentTimeMillis() - s_time);

		s_time = System.currentTimeMillis();
		System.out.println(sumWithCondition(0, 26433346l, index -> true));
		System.out.println(System.currentTimeMillis() - s_time);

		s_time = System.currentTimeMillis();
		System.out.println(sumWithCondition(0, 2643346l, index -> index % 2 == 0));
		System.out.println(System.currentTimeMillis() - s_time);
		
		s_time = System.currentTimeMillis();
		System.out.println(sumWithCondition(0, 2643336l, index -> index % 2 == 1));
		System.out.println(System.currentTimeMillis() - s_time);


		Runnable runnable = ()-> System.out.println("I am running");
		runnable.run();
		runnable.run();
	}

	public static boolean isPrime(int i) {

		IntPredicate predicate = index -> i % index == 0;

		return IntStream.range(2, (int) Math.pow(i, 0.5) + 1).parallel().noneMatch(predicate);
	}

	public static Long sumWithCondition(long from, long to, LongPredicate predicate) {

		return LongStream.range(from, to).parallel().filter(predicate).sum();
	}
}
