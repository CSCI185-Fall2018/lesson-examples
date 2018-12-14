package week14;

import java.math.BigInteger;

class Main
{
    public static void main(String[] args)
    {
//        for(int i=0; i<100; i++)
//        {
//            System.out.printf("%d: %d\n", i, iter_fibonacci(i));
//        }

        BigInteger a = new BigInteger("100000000000000000000");
        System.out.println(a.multiply(a));
    }

    static void iter_countdown(int n)
    {
        for(int i=n; i>0; i--)
            System.out.println(i);
    }

    static void rec_countdown(int n)
    {
        if(n > 0)
        {
            System.out.println(n);
            rec_countdown(n - 1);
        }
    }

    static int rec_fibonacci(int n)
    {
        if(n < 2)
            return n;
        else
            return rec_fibonacci(n-1) + rec_fibonacci(n-2);
    }

    static long iter_fibonacci(int n)
    {
        if(n < 2)
            return n;
        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<=n; i++)
            arr[i] = arr[i-1] + arr[i-2];
        return arr[n];
    }

}