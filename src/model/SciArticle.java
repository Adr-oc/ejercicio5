package model;

public class SciArticle extends Material{
    //attributes
    protected String vol;

    //constructors
    //constructor with vol
    public SciArticle(String type,String name, String publisher, String publicationYear, String genre, String authors, String vol) {
        super(type,name, publisher, publicationYear, genre, authors);
        this.vol = vol;
    }
    //constructor without vol
    public SciArticle(String type, String name, String publisher, String publicationYear, String genre, String authors) {
        super(type,name, publisher, publicationYear, genre, authors);
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
