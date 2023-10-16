package model;

public class Tesis extends Material{
    //attributes
    protected boolean published;
    protected String url;
    
    public Tesis(String name, String publisher, String publicationYear, String genre, String authors, String type, boolean published, String url) {
        super(name, publisher, publicationYear, genre, authors, type);
        this.published = published;
        this.url = url;
    }
    public Tesis(String name, String publisher, String publicationYear, String genre, String authors, String type, boolean published) {
        super(name, publisher, publicationYear, genre, authors, type);
        this.published = published;
    }

    @Override
    public String generateAPAReference() {
        // Generate the APA reference for a book
        return String.format(
            "%s " +
            "(%s)." +
            " %s" +
            " %s.",
            this.getAuthors(),
            this.publicationYear,
            this.name,
            isPublished()
        );
    }

    private String isPublished () {
        if (this.published == true) {
            return "[Tesis de "+this.genre + ", "+ this.publisher + "]. "+ haveUrl();
        }
        else {
            return "[Tesis de "+this.genre + " no publicada]. "+ this.publisher;
        }
    }
    private String haveUrl(){
        if (this.url != null) {
            return this.url;
        }
        else {
            return "";
        }
    }
}
