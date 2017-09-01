package tr.com.sedatpolat.Java8Feature.foreach;

import java.io.Serializable;
import java.util.function.Consumer;

/**
 * 
 * @author sedpol
 *
 */
public class Book implements Consumer<Book>, Comparable<Book>, Serializable {

	private static final long serialVersionUID = 1L;

	public Book() {
		super();
	}

	public Book(Integer id, String title, String author, Integer pageNumber) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;
	}

	private Integer id;
	private String title;
	private String author;
	private Integer pageNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void accept(Book book) {
		System.out.print(book.getId() + ", ");

	}

	@Override
	public int compareTo(Book o) {
		return o.id.compareTo(this.id);
	}
}
