package lambdas;

import java.util.Arrays;
import java.util.List;


class Book {
	private String title;
	private String genre;
	public Book(String title, String genre){
		this.title = title; this.genre = genre;
	}    

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}

interface Reader {
	public void read(Book b);
	public default void defread(Book b) {
		System.out.println("Read from DEFAULT method:  " + b.getTitle());
	};
}

interface Reader2 {
	public static void statread(Book b) {
		System.out.println("Read from Reader2:  " + b.getTitle());
	};
}

public class FITest {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(
				new Book("Gone with the wind", "Fiction"),
				new Book("Bourne Ultimatum", "Thriller"),
				new Book("The Client", "Thriller")
		);

	 	Reader r = b -> {
			System.out.println("Reading book "+b.getTitle());
		};

		books.forEach(x -> r.read(x));
		
		// the DEFAULT method of a functional interface can also be used
		books.forEach(x -> r.defread(x));

		// static methods are also possible
		books.forEach(x -> Reader2.statread(x));
		
	} 

}
