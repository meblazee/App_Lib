package utils;

import java.util.Scanner;
import data.Book;

public class DataReader {
    private Scanner scan;

    public DataReader() {
        scan = new Scanner((System.in));
    }

    public void close(){
        scan.close();
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = scan.nextLine();
        System.out.println("Autor: ");
        String author = scan.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scan.nextLine();
        System.out.println("ISBN: ");
        String isbn = scan.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = scan.nextInt();
        scan.nextLine();
        System.out.println("Ilość stron: ");
        int pages = scan.nextInt();
        scan.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
}
