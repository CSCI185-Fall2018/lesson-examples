package week13;

class Book
{
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

    private String title, author;

    public Book(){}
    public Book(String title, String author)
    {
        setTitle(title);
        setAuthor(author);
    }

    public String toString()
    {
        return String.format("Book(title=%s, author=%s)", title, author);
    }

    public boolean equals(Object object)
    {
        if (! (object instanceof Book))
            return false;
        else
            return equals(object);
    }

    public boolean equals(Book other)
    {
        return title.equals(other.title) && author.equals(other.author);
    }



}