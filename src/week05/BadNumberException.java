package week05;

class BadNumberException extends Exception
{
    String message;

    public BadNumberException(String message)
    {
        super();
        this.message = message;
    }

    public String toString()
    {
        return message;
    }
}