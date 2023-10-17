package model;
import java.util.Arrays;
import java.util.Collections;

public abstract class Material {
    
    protected String name;
    protected String publisher;
    protected String publicationYear;
    protected String genre;
    protected String authors;
    protected String type;
    


    //constructor
    public Material(String type,String name, String publisher, String publicationYear, String genre, String authors) {
        this.name = name;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.authors = authors;
        this.type = type;
    }


    //methods
    public abstract String generateAPAReference();
    

    //setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }


    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getAuthors() {
        String[] authors = this.authors.split(";");
        for (int i = 0; i < authors.length; i++) {
            authors[i] = authors[i].split(" ")[1]+" "+authors[i].split(" ")[0].substring(0, 1)+"."; 
        }
        Collections.sort(Arrays.asList(authors));
        String formattedAuthors = "";

        for (int i = 0; i < authors.length; i++) {
            String author = authors[i];
            String[] authorTokens = author.split(" ");
            String lastName = authorTokens[0];
            String firstName = authorTokens[1];
            //String initials = firstName.substring(0, 1) + ".";
            formattedAuthors += lastName + ", " + firstName + (i < authors.length - 1 ? ", " : "");
        }

        return formattedAuthors;
    }


    public void setAuthors(String authors) {
        this.authors = authors;
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    
}

