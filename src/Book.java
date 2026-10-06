public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double price;
    private String genre;
    private fees fees;

    public Book(String title, String author, int publicationYear, double price, String genre, fees fees) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
        this.genre = genre;
        this.fees = fees;
    }
    public Book(String title, String author, int publicationYear, double price, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
        this.genre = genre;
    }
    public Book(String title, String author, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Book(String title) {
        this.title = title;
    }


   public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public fees getFees() {
        return fees;
    }
    public void setFees(fees fees) {
        this.fees = fees;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", fees=" + fees +
                '}';
    }


    
    
    


}
