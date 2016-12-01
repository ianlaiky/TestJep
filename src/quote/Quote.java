package quote;

public class Quote {
    String author;
    String quote;

    public Quote(String author, String quote) {
        this.author = author;
        this.quote = quote;
    }

    public Quote() {
        this.author = "";
        this.quote = "";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

}