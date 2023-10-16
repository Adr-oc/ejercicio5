import model.Book;
import model.Library;

public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        
        Book book = new Book("The Hitchhiker's Guide to the Galaxy", "Del Rey", 1979, "Science fiction", "Douglas Adams;Adrian Orantes", "Book");
        library.addMaterial(book);

        
        System.out.println(book.generateAPAReference());
    }
}
