package app;

import utils.DataReader;
import data.Book;
import data.Library;

public class LibraryControl {
    //zmienne do kontrolowania programu
    public final int exit = 0;
    public final int addBook = 1;
    public final int printBooks = 2;

    //zmienna do komunikacji z użytkownikiem
    private DataReader dataReader;

    //przechowalnia danych
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    /*
     *Główna pętla programu, która pozwala na wybór opcji
     */
    public void controlLoop() {
        int option;
        printOptions();
        while ((option = dataReader.getInt()) != exit) {
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wybierz ponownie.");
            }
            printOptions();
        }
            //zamykamy strumień wejścia
        dataReader.close();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - Wyjście z programu");
        System.out.println("1 - Dodanie nowej książki");
        System.out.println("2 - Wyświetlenie dostępnych książek");
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private  void printBooks() {
        library.printBooks();
    }
}

