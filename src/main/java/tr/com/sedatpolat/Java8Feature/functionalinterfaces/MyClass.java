package tr.com.sedatpolat.Java8Feature.functionalinterfaces;

public class MyClass implements FunctionalInterface1, FunctionalInterface2{


	@Override
	public void method() {
		throw new UnsupportedOperationException("Method is not implemented");
		
	}

	@Override
	public void print() {
		// we have to choice one of the supper class implementation.
		FunctionalInterface2.super.print();
		FunctionalInterface1.super.print();
		
		// or write own implementation
//		System.out.println("myclass");
	}
}
