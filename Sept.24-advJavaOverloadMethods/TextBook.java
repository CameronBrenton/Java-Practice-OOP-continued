public class TextBook {
	private String title;
	private String author;
	private String publisher;
	
	public TextBook(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public TextBook(TextBook textbook){
		this.title = textbook.title;
		this.author = textbook.author;
		this.publisher = textbook.publisher;
	}

	public String toString(){
		return title + " was written by " + author + " and published by " + publisher;
	}
}
