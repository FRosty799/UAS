package UAS.Project.Model;

public class Buku {
    private String ISBN;
    private String Title;
    private String Author;
    private boolean Availability;

    public String getISBN() {
        return this.ISBN;
    }

    public Buku setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }

    public String getTitle() {
        return this.Title;
    }

    public Buku setTitle(String Title) {
        this.Title = Title;
        return this;
    }

    public String getAuthor() {
        return this.Author;
    }

    public Buku setAuthor(String Author) {
        this.Author = Author;
        return this;
    }

    public boolean isAvailability() {
        return this.Availability;
    }

    public Buku setAvailability(boolean Availability) {
        this.Availability = Availability;
        return this;
    }

}
