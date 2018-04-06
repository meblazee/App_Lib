class Book {
	String title;
	String author;
	int releaseDate;
	int pages;
	String publisher;
	String isbn;

	Book(String bookTitle, String bookAuthor, int bookRelease, 
		    int bookPages, String bookPublisher, String bookIsbn) {
		title = bookTitle;
		author = bookAuthor;
		releaseDate = bookRelease;
		pages = bookPages;
		publisher = bookPublisher;
		isbn = bookIsbn;
	}

	void printInfo() {
		String info = "-------------------- \n" + title + "; \n" + author + "; \n" + releaseDate + "; \n" 
		            + pages + "; \n" + publisher + "; \n" + isbn;
		System.out.println(info);
	}
	
}