package app;

import data.Book;
import utils.DataReader;

public class Library{
    public static void main (String[] args){
        final String appName = "Biblioteka v0.6" + '\n';

        Book[] books = new Book[1000];

        DataReader dataReader = new DataReader();

        System.out.print(appName);
        System.out.println("Wprowadź nową pozycję: ");
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        books[0].printInfo();
        books[1].printInfo();

        System.out.println("System może przechowywać do " + books.length + " ksążek");
    }
}
