package model;

public abstract class Material {
    
    protected String name;
    protected String publisher;
    protected int publicationYear;
    protected String genre;
    protected String authors;
    protected String type;
    


    //constructor
    public Material(String name, String publisher, int publicationYear, String genre, String authors, String type) {
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


    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getAuthors() {
        return authors;
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

