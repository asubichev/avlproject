public class Book
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

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public void setTitle(String str) { title = str; }
    public void setAuthor(String str) { author = str; }
}
