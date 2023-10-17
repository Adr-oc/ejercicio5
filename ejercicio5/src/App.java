import java.util.List;
import model.Book;
import model.DVD;
import model.Library;
import model.Material;
import model.Newspaper;
import model.SciArticle;
import model.Tesis;

public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        
        Tesis tesis = new Tesis("The Nothing Book", "Universidad del Valle de Guatemala", "1979", "Science fiction", "Adrian Orantes", "Tesis", true, "https://www.google.com"); 
        library.addMaterial(tesis);


        List<Material> materials = library.getCatalog();
        for (Material material : materials) {
            System.out.println(material.generateAPAReference());
        }
        
    }
}
