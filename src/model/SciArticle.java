package model;

public class SciArticle extends Material{
    //attributes
    protected String vol;

    //constructor
    public SciArticle(String name, String publisher, int publicationYear, String genre, String authors, String type, String vol) {
        super(name, publisher, publicationYear, genre, authors, type);
        this.vol = vol;
    }

    //methods
    @Override
    public String generateAPAReference() {
        return String.format(
            "%s " +
            "(%d)." +
            " %s " +
            "de %s",
            this.getAuthors(),
            this.publicationYear,
            this.name,
            this.publisher
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
