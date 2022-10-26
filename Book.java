public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private String isbn;

    public Book()
    {
        title = "";
        author = "";
    }

    public Book(String x, String y, String b)
    {
        title = x;
        author = y;
        isbn = b;
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
        return Long.valueOf(this.isbn) == Long.valueOf(anotherBook.isbn);
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public void setTitle(String str) { title = str; }
    public void setAuthor(String str) { author = str; }
    public void setIsbn(String str) { isbn = str; }
    public String toString() { return isbn; }
}
