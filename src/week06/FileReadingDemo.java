package week06;

import java.io.File;
import java.util.Scanner;

public class FileReadingDemo
{

    public static void main(String[] args) throws Exception
    {
        // for getting the runtime working directory
//        System.out.println(System.getenv("PWD"));

        String path = "lesson-examples/src/week06/data/input.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

}
