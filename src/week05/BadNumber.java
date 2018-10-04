package week05;

import java.util.Scanner;

public class BadNumber
{


    public static void verifyGoodNumber(int n) throws BadNumberException
    {
        if(n % 2 == 0)
            throw new BadNumberException("number cannot be even");
    }

    public static void main(String[] args) throws Exception
    {

        int[] array = {1,5,4,3};

        try
        {
            System.out.println(array[2]);
//            System.out.println(array[4]);
//            System.out.println(array[4]);
        }
        catch (Exception err)
        {
            System.out.println("something went wrong");
            System.out.println(err.getMessage());
        }
        finally
        {
            System.out.println("cleaning up");
        }

        System.out.println("pick a number");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        verifyGoodNumber(number);



    }

}
