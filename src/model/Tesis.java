package model;

public class Tesis extends Material{
    //attributes
    protected boolean published;
    protected String url;
    
    //constructors
    public Tesis(String type, String name, String publisher, String publicationYear, String genre, String authors, boolean published, String url) {
        super(type,name, publisher, publicationYear, genre, authors);
        this.published = published;
        this.url = url;
    }
    public Tesis(String type,String name, String publisher, String publicationYear, String genre, String authors, boolean published) {
        super(type,name, publisher, publicationYear, genre, authors);
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