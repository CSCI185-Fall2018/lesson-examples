package week06;

public class StringBuilderDemo
{


    public static void main(String[] args)
    {
        int[] array = {5, 3, 2, 6};
        // [5, 3, 2, 6]

        StringBuilder builder = new StringBuilder();

        builder.append('[');
        for(int item: array)
        {
            builder.append(item);
            builder.append(", ");
        }
        int n = builder.length();
        builder.delete(n-2, n);
        builder.append(']');

        String result = builder.toString();

        System.out.println(result);
    }
}
