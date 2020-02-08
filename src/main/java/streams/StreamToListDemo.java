package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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



public class StreamToListDemo {

	public static void main(String[] args) {
		
	List<Book> books = Arrays.asList(
	        new Book("Gone with the wind", "Fiction"),
	        new Book("Bourne Ultimatum", "Thriller"),
	        new Book("The Client", "Thriller")
	);

	List<String> genreList1 = new ArrayList<>();
	List<String> genreList2 = new ArrayList<>();
	List<String> genreList3 = new ArrayList<>();
	List<String> genreList4 = new ArrayList<>();

	// option 1
	books.stream().map(Book::getGenre).forEach(s -> genreList1.add(s));
    System.out.println(genreList1);
	
	// option 2
	genreList2 = books.stream().map(Book::getGenre).collect(Collectors.toList());
    System.out.println(genreList2);

	// option 3
    books.stream().map(b -> b.getGenre()).forEach(genreList3::add);
    System.out.println(genreList3);
		
	}

}
