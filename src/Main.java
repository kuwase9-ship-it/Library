public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99, "Fiction");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 12.99, "Fiction");
        Book book3 = new Book("1984", "George Orwell", 1949, 9.99, "Dystopian");

        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + ", published in " + book1.getPublicationYear() + ", Price: $" + book1.getPrice() + ", Genre: " + book1.getGenre());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + ", published in " + book2.getPublicationYear() + ", Price: $" + book2.getPrice() + ", Genre: " + book2.getGenre());
        System.out.println("Book 3: " + book3.getTitle() + " by " + book3.getAuthor() + ", published in " + book3.getPublicationYear() + ", Price: $" + book3.getPrice() + ", Genre: " + book3.getGenre());

    }
}