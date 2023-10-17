package vista;
import java.util.Scanner;
import controller.Controller;

public class Vista {

    // Create a Scanner object
    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();
        
    //constructor
    public Vista() throws Exception {
        this.DisplayMenu();
    }

    public void DisplayMenu(){
        int selection = -1;
        while (selection != 0) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Contar materiales.");
            System.out.println("2. Mostrar el catálogo disponible con sus citas en formato APA.");
            System.out.println("0. Salir.");
            System.out.println("Seleccione una opción:");
        
            selection = scanner.nextInt();
        
            switch (selection) {
                case 1:
                    controller.printLibraryWithAPA();
                    break;
                case 2:
                    controller.printLibraryWithAPA();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
    
        }
    }
}

