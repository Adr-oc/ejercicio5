package controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.*;
import utils.CSVReader;
public class Controller {

    Library library = new Library();
    CSVReader csvReader = new CSVReader("src/data/material.csv");
    List<List<String>> records = csvReader.read();
    Map<String, Map<String, Map<Integer, Integer>>> counts = new HashMap<>();


    public List<List<String>> getRecords() {
        return records;
    }
    public void setRecords(List<List<String>> records) {
        this.records = records;
    }


    //constructor
    public Controller() throws Exception {
        
    }


    private void addMaterial(List<List<String>> recordList){
        for (List<String> record : recordList) {
            String type = record.get(0);
            String name = record.get(1);
            String publisher = record.get(2);
            String publicationYear = record.get(3);
            String genre = record.get(4);
            String authors = record.get(5);

            if (type.equals("Book")) {
                Book book = new Book(name, publisher, publicationYear, genre, authors, type);
                library.addMaterial(book);
            } else if (type.equals("DVD")) {
                DVD dvd = new DVD(name, publisher, publicationYear, genre, authors, type);
                library.addMaterial(dvd);
            } else if (type.equals("Newspaper")) {
                String urlNP = record.get(6);
                if (urlNP == "N/A") {
                    Newspaper newspaper = new Newspaper(name, publisher, publicationYear, genre, authors, type);
                    library.addMaterial(newspaper);
                } else {
                    Newspaper newspaper = new Newspaper(name, publisher, publicationYear, genre, authors, type, urlNP);
                    library.addMaterial(newspaper);
                }
            } else if (type.equals("SciArticle")) {
                String Vol = record.get(6);
                if (Vol == "N/A") {
                    SciArticle sciarticle = new SciArticle(name, publisher, publicationYear, genre, authors, type);
                    library.addMaterial(sciarticle);
                } else {
                    SciArticle sciarticle = new SciArticle(name, publisher, publicationYear, genre, authors, type, Vol);
                    library.addMaterial(sciarticle);
                }
            } else if (type.equals("Tesis")) {
                Boolean published = Boolean.parseBoolean(record.get(6));
                String urlTesis = record.get(7);
                if (urlTesis == "N/A") {
                    Tesis tesis = new Tesis(name, publisher, publicationYear, genre, authors, type, published);
                    library.addMaterial(tesis);
                } else {
                    Tesis tesis = new Tesis(name, publisher, publicationYear, genre, authors, type, published, urlTesis);
                    library.addMaterial(tesis);
                }
            } else {
                Book bookls = new Book(name, publisher, publicationYear, genre, authors, type);
                library.addMaterial(bookls);
            }
            
        }
    }


    public void printLibraryWithAPA() {
        addMaterial(records);
        List<Material> materials = library.getCatalog();
        for (Material material : materials) {
            System.out.println("------------------------------------------------");
            System.out.println(material.getName());
            System.out.println("APA: "+material.generateAPAReference());
            System.out.println("------------------------------------------------");
        }
    }


    
    
    
}
