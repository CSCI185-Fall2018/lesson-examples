package week02;

class Main
{

    public static void main(String[] args)
    {

        // not a primitive type
        String text = "hello world";

        //
        byte b = 127;

        short s;
        long l = 100L;
        int x;

//        System.out.println(b);


        boolean y;


        double z = 1.0;
        float a = 2.9f;

        char c = 'h';

        int c2 = (int) c;

//        System.out.println(c2);


//        System.out.println((double) 2 / 5);
        System.out.println(1.0 * 2 / 5);

        int n = 9;
        n += 2;
        n++;
        ++n;

        // logical operators
        /*
         * ==
         * !=
         * <
         * >
         * <=
         * >=
         *
         *
         * &&
         * ||
         */

        // bitwise operators
        /*
         * &
         * |
         * !
         * ^
         * <<
         * >>
         */

        System.out.println(1 << 2);

        String message = "something";

        System.out.println((Object)message instanceof Integer);

    }

    public static boolean isOdd(int n)
    {
        return n % 2 == 1;
    }

}