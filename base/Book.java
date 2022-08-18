package base;

public class Book {

    private long ISBN;
    private String title;
    private String description;
    private int price;
    private Author author;

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void display(){
        System.out.println("ISBN = " + ISBN);
        System.out.println("title = " + title);
        System.out.println("description = " + description);
        System.out.println("price = " + price);
        System.out.println(author.getAuthorName());
        System.out.println(author.getPenName());

    }
}
