package model;

public class SciArticle extends Material{
    //attributes
    protected String vol;

    //constructor
    public SciArticle(String name, String publisher, String publicationYear, String genre, String authors, String type, String vol) {
        super(name, publisher, publicationYear, genre, authors, type);
        this.vol = vol;
    }

    //methods
    @Override
    public String generateAPAReference() {
        return String.format(
            "%s " +
            "(%s)." +
            " %s" +
            " %s,"+
            " %s.",
            this.getAuthors(),
            this.publicationYear,
            this.name,
            this.publisher,
            this.vol
        );
    }


    //setters and getters
    public String getVol() {
        return vol;
    }
    public void setVol(String vol) {
        this.vol = vol;
    }

}
