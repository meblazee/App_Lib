package app;

import data.Book;

public class Library{
    public static void main (String[] args){
        final String appName = "Biblioteka v0.5" + '\n';

        Book[] books = new Book[1000];

        books[0] = new Book("Los jest myśliwym", "Ernest Kellogg Gann", 2011, 493,
                "Lotnicza Oficyna Wydawnicza LOW PASS", "9788393424702");
        books[1] = new Book("7 nawyków skutecznego działania", "Stephen R. Covey", 2007, 376,
                "Rebis", "9788373018778");
        books[2] = new Book("Algorytmy. Wydanie IV", "Robert Sedgewick, Kevin Wayne",2012, 952,
                "Helion", "9788324635368");
        books[3] = new Book("Drach", "Szczepan Twardoch",2014, 400,
                "Wydawnictwo Literackie", "9788308054314");

        System.out.print(appName);
        System.out.println("Ksiżki dostępne w bibliotece: ");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        books[3].printInfo();
        System.out.println("System może przechowywać do " + books.length + " ksążek");
    }
}
