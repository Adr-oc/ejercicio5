import java.util.List;
import model.Book;
import model.DVD;
import model.Library;
import model.Material;

public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        
        DVD dvd = new DVD("Rocky", "Del Rey", 1979, "Science fiction", "Douglas Adams", "DVD");
        library.addMaterial(dvd);

        Book book = new Book("The Nothing Book", "Del Rey", 1979, "Science fiction", "Douglas Adams", "Book");
        library.addMaterial(book);

        List<Material> materials = library.getCatalog();
        for (Material material : materials) {
            System.out.println(material.generateAPAReference());
        }
        
    }
}
