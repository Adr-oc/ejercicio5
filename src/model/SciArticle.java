package model;

public class SciArticle extends Material{
    //attributes
    protected String vol;

    //constructors
    //constructor with vol
    public SciArticle(String name, String publisher, String publicationYear, String genre, String authors, String type, String vol) {
        super(name, publisher, publicationYear, genre, authors, type);
        this.vol = vol;
    }
    //constructor without vol
    public SciArticle(String name, String publisher, String publicationYear, String genre, String authors, String type) {
        super(name, publisher, publicationYear, genre, authors, type);  
    }


    //methods
    @Override
    public String generateAPAReference() {
        return String.format(
            "%s " +
            "(%s)." +
            " %s" +
            " %s.",
            this.getAuthors(),
            this.publicationYear,
            this.name,
            volExist()
        );
    }

    private String volExist() {
        if (this.vol == null) {
            return this.publisher;
        }
        else {
            return this.publisher + ". " + this.vol;
        }
    }

}
