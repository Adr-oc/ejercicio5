package model;

public class DVD extends Material{

    public DVD(String name, String publisher, String publicationYear, String genre, String authors, String type) {
        super(name, publisher, publicationYear, genre, authors, type);
    }

    @Override
    public String generateAPAReference() {
        // Generate the APA reference for a book
        return String.format(
            "%s(Director)." +
            " (%s)." +
            " %s[Película]." +
            " %s",
            this.getAuthors(),
            this.publicationYear,
            this.name,
            this.publisher
        );
    }

}
