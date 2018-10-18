package week07;

import java.io.*;
import java.util.Scanner;

public class ReaderDemo
{
    public static void main(String[] args)
    {

        if (args.length < 1)
        {
            System.err.println("missing file path");
            return;
        }

        String file_path = args[0];
        File file = new File(file_path);


        try
        {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();

        } catch (FileNotFoundException err)
        {
            System.err.printf("could not read file: %s", file_path);
        }

    }
}
