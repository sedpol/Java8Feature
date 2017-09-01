package tr.com.sedatpolat.Java8Feature.functionalinterfaces;
/**
 * 
 * @author sedpol
 *
 */
public class Tester {

	public static void main(String[] args) {

		
		MyClass myClass = new MyClass();
		
		myClass.print();
		myClass.printString("Hello World"); // it is already defined in interface1
		System.out.println("*************");
		
		FunctionalInterface2 interface2 = new FunctionalInterface2() {
			
			@Override
			public void method() {
				System.out.println("interface2");
			}
		};
		
		interface2.method();
		interface2.print();

		System.out.println("*************");
		
		FunctionalInterface1 interface1 = ()->System.out.println("interface1");
		interface1.method();
		
		
	}
}
