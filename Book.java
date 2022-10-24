public class Book implements Comparable<Book>
{
    private String title;
    private String author;

    public Book()
    {
        title = "";
        author = "";
    }

    public Book(String x, String y)
    {
        title = x;
        author = y;
    }

    @Override
    public int compareTo(Book anotherBook)
    {
        return this.title.compareTo(anotherBook.title);
    }

    public boolean equals(Book anotherBook)
    {
        return this.title.equals(anotherBook.title) && this.author.equals(anotherBook.author);
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public void setTitle(String str) { title = str; }
    public void setAuthor(String str) { author = str; }
}
