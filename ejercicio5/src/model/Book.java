package model;

public class Book extends Material {
    
    public Book(String type,String name, String publisher, String publicationYear, String genre, String authors) {
        super(type,name, publisher, publicationYear, genre, authors);
    }

    @Override
    public String generateAPAReference() {
        // Generate the APA reference for a book
        return String.format(
            "%s " +
            "(%s)." +
            " %s " +
            "de %s",
            this.getAuthors(),
            this.publicationYear,
            this.name,
            this.publisher
        );
    }

}
