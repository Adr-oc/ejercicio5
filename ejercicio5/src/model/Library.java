package model;
import java.util.ArrayList;
import java.util.List;

public class Library {

    //attributes
    private List<Material> catalog;



    //constructor
    public Library() {
        this.catalog = new ArrayList<>();
    }


    //methods
    public void addMaterial(Material material) {
        this.catalog.add(material);
    }


    //setters and getters
    public List<Material> getCatalog() {
        return this.catalog;
    }



}
