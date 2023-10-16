import java.util.List;
import model.Book;
import model.DVD;
import model.Library;
import model.Material;

public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        
        DVD dvd = new DVD("El padrino", "Paramount", "1973", "Mafia", "Francis Ford Coppola", "DVD");
        library.addMaterial(dvd);

        Book book = new Book("The Nothing Book", "Del Rey", "1979", "Science fiction", "Adrian Orantes;Ludwing Cano;Douglas Adams", "Book");
        library.addMaterial(book);

        List<Material> materials = library.getCatalog();
        for (Material material : materials) {
            System.out.println(material.generateAPAReference());
        }
        
    }
}
