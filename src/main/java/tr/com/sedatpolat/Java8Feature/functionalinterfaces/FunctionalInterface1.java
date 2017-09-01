package tr.com.sedatpolat.Java8Feature.functionalinterfaces;

@FunctionalInterface
public interface FunctionalInterface1 {

	public void method();

	public default void print() {
		printString("MyInterface1 Default");
	}

	public default void printString(String str) {
		System.out.println("MyInterface1 prints:" + str);
	}
}
