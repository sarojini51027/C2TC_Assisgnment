package Inheritance;

public class Book {
	private String author;

    public Book(int id, String title, String author) {
        super();
        this.author = author;
    }

    public void displayInfo() {
        String title = null;
		String id = null;
		System.out.println("Book: [ID: " + id + ", Title: " + title + ", Author: " + author + "]");
    }

    public String getAuthor() {
        return author;
    }
	


}

