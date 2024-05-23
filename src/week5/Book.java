package week5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {
	private final String name;
	private final int pageCount;
	private final String authorName;
	private final int publicationYear;

	public Book (String name, int pageCount, String authorName, int publicationYear) {
		this.name = name;
		this.pageCount = pageCount;
		this.authorName = authorName;
		this.publicationYear = publicationYear;
	}

	public String getName () {
		return name;
	}

	public int getPageCount () {
		return pageCount;
	}

	public String getAuthorName () {
		return authorName;
	}

	public int getPublicationYear () {
		return publicationYear;
	}

	// This method defines the natural ordering of Book objects. This is now the default way of ordering.
	@Override
	public int compareTo (Book other) {
		return this.getName().compareTo(other.getName());
	}

	// This comparator defines an alternative ordering for Book objects.
	static Comparator<Book> pageCountComparator = new Comparator<>() {
		@Override
		public int compare (Book b1, Book b2) {
			return Integer.compare(b1.getPageCount(), b2.getPageCount());
		}
	};

	@Override
	public String toString() {
		return String.format("%-40s %-20s %-30s %-15s",
				this.getName(),
				"Page Count: " + this.getPageCount(),
				"Author: " + this.getAuthorName(),
				"Year: " + this.getPublicationYear());
	}

	public static void main(String[] args) {

		Book book1 = new Book("The Hitchhiker's Guide to the Galaxy", 224, "Douglas Adams", 1979);
		Book book2 = new Book("Earthsea Saga", 685, "Ursula K. Le Guin", 1968);
		Book book3 = new Book("The Silmarillion", 365, "J.R.R. Tolkien", 1977);
		Book book4 = new Book("2001: A Space Odyssey", 297, "Arthur C. Clarke", 1968);
		Book book5 = new Book("Foundation", 244, "Isaac Asimov", 1951);

		// TreeSet to store books sorted by name (A-Z)
		Set<Book> booksByName = new TreeSet<>();
		booksByName.add(book1);
		booksByName.add(book2);
		booksByName.add(book3);
		booksByName.add(book4);
		booksByName.add(book5);

		System.out.println("Books sorted by name (A-Z):");
		for (Book book : booksByName) {
			System.out.println(book);
		}

		// TreeSet to store books sorted by page count
		Set<Book> booksByPageCount = new TreeSet<>(pageCountComparator);

		// Transfer books from booksByName to booksByPageCount
		booksByPageCount.addAll(booksByName);

		System.out.println("\nBooks sorted by page count:");
		for (Book book : booksByPageCount) {
			System.out.println(book);
		}
	}
}
