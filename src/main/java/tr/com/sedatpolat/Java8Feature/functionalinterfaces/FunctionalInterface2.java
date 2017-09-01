package tr.com.sedatpolat.Java8Feature.functionalinterfaces;

@FunctionalInterface
public interface FunctionalInterface2 {

	public void method();
	
	public default void print() {
		printMe("MyInterface2");
	}
	
	/**
	 * only visible to this.
	 */
	public static void printMe(String str) {

		System.out.println(str);
	}
}
