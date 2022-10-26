public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private long isbn;

    public Book()
    {
        title = "";
        author = "";
    }

    public Book(String x, String y, long b)
    {
        title = x;
        author = y;
    }

    @Override
    public int compareTo(Book anotherBook)
    {
        //return this.title.compareTo(anotherBook.title);
        // return this.author.compareTo(anotherBook.author);
        Long obj1 = new Long(this.isbn);
        Long obj2 = new Long(anotherBook.isbn);
        return obj1.compareTo(obj2);
    }

    public boolean equals(Book anotherBook)
    {
        return this.title.equals(anotherBook.title) && this.author.equals(anotherBook.author);
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public long getIsbn() { return isbn; }
    public void setTitle(String str) { title = str; }
    public void setAuthor(String str) { author = str; }
    public void setIsbn(String str) { isbn = Long.valueOf(str); }
}
