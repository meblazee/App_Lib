package app;

import utils.DataReader;
import data.Book;
import data.Library;

public class LibraryControl {
    //zmienne do kontrolowania programu
    public static final int EXIT = 0;
    public static final int ADD_BOOK = 1;
    public static final int PRINT_BOOKS = 2;

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
        while ((option = dataReader.getInt()) != EXIT) {
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
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
        System.out.println(EXIT + " - Wyjście z programu");
        System.out.println(ADD_BOOK + " - Dodanie nowej książki");
        System.out.println(PRINT_BOOKS + " - Wyświetlenie dostępnych książek");
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private  void printBooks() {
        library.printBooks();
    }
}

