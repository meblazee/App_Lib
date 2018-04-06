class Library{
	public static void main (String[] args){
		final String appName = "Biblioteka v0.3" + '\n';
        
        Book book1 = new Book("Los jest myśliwym", "Ernest Kellogg Gann", 2011, 493, 
        	                  "Lotnicza Oficyna Wydawnicza LOW PASS", "9788393424702");
        Book book2 = new Book("7 nawyków skutecznego działania", "Stephen R. Covey", 2007, 376,
        	                  "Rebis", "9788373018778");
        Book book3 = new Book("Algorytmy. Wydanie IV", "Robert Sedgewick, Kevin Wayne",2012, 952,
        	                  "Helion", "9788324635368");
        Book book4 = new Book("Drach", "Szczepan Twardoch",2014, 400,
        	                  "Wydawnictwo Literackie", "9788308054314");

		System.out.print(appName);
		System.out.println("Ksiżki dostępne w bibliotece: ");
		book1.printInfo();
		book2.printInfo();
		book3.printInfo();
		book4.printInfo();
	}
}