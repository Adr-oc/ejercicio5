package model;

public class Newspaper extends Material {
    protected String url;


    //constructor with url
    public Newspaper(String name, String publisher, String publicationYear, String genre, String authors, String type,String url) {
        super(name, publisher, publicationYear, genre, authors, type);
        this.url = url;
    }
    //constructor without url
   public Newspaper(String name, String publisher, String publicationYear, String genre, String authors, String type) {
        super(name, publisher, publicationYear, genre, authors, type);  
    }


    @Override
    public String generateAPAReference() {
        return String.format(
            "%s " +
            "(%s)." +
            " %s." +
            " %s.",
            this.getAuthors(),
            this.publicationYear,
            this.name,
            this.urlexist()
        );
    }

    private String urlexist() {
        if (this.url == null) {
            return this.publisher;
        }
        else {
            return this.publisher + ". " + this.url;
        }
    }
}
