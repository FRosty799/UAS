package UAS.Project.Model;

public class Buku {
    private String ISBN;
    private String BookTitle;
    private String Author;
    private boolean Availability;

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTitle() {
        return this.BookTitle;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public boolean isAvailability() {
        return this.Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }

}
