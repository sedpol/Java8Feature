package tr.com.sedatpolat.Java8Feature.foreach;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author sedpol
 *
 */
public class ForEach {
	public static void main(String[] args) throws NoSuchAlgorithmException {

		List<Book> bookList = new ArrayList<Book>();

		for (int i = 0; i < 10; i++) {
			int id = SecureRandom.getInstanceStrong().nextInt(1000);
			
			Book book = new Book(id, i + " title", i + " author", i * 123);
			bookList.add(book);
		}

		System.out.println("Sequential");
		
		bookList.forEach(new Consumer<Book>() {

			public void accept(Book book) {
				System.out.print(book.getId() + ", ");
			}
		});

		System.out.println("\n***********");
		System.out.println("parallel random");

		bookList.parallelStream().forEach(new Consumer<Book>() {
			public void accept(Book book) {

				System.out.print(book.getId()+ ", ");
			}
		});

		System.out.println("\n***********");
		System.out.println("paralel ordered");
		bookList.parallelStream().forEachOrdered(new Consumer<Book>() {

			public void accept(Book book) {
				System.out.print(book.getId()+ ", ");
				
			}
		});

		System.out.println("\n***********");
		System.out.println("Book own action");
		bookList.forEach(new Book());
	}
}
