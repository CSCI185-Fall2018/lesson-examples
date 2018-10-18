package week07;

import java.io.File;
import java.io.PrintWriter;

public class WriterDemo
{

    public static void main(String[] args) throws Exception
    {

        if (args.length < 1)
        {
            System.err.println("missing file path");
            return;
        }

        String file_path = args[0];
        File file = new File(file_path);


        PrintWriter writer = new PrintWriter(file);

        writer.println("this is a string");
        writer.printf("formatted string %d\n", 4);

        writer.close();

    }
}
