package week06;

public class EnumDemo
{
    enum Color {Red, Green, Blue}

    public static void main(String[] args)
    {
        // create variable of type color and value red
        Color c = Color.Red;
        System.out.println(c);

        // convert color to string
        String s = c.toString();
        System.out.println(s);

        // convert string to color
        Color c2 = Color.valueOf("Blue");
        System.out.println(c2);
    }
}
