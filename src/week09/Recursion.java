package week09;

class Recursion
{

    public static int fibonacci(int index)
    {
        // 0 1 1 2 3 5
        /*
            let i be index of fibonacci sequence
            f(0) = 0
            f(1) = 1
            f(i) = f(i-1) + f(i-2)
         */

        if(index == 0 || index == 1)
            return index;
        return fibonacci(index-1) + fibonacci(index-2);
    }

    public static void test_fib()
    {
        for(int i=0; i<100; i++)
        {
            int result = fibonacci(i);
            System.out.printf("%4d: %d\n", i, result);
        }
    }

    public static void printN(int n)
    {
        /**
         * runtime:
         * O(N)
         */

        for (int i=1; i<=n; i++)
            System.out.println(i);
    }

    public static void recursivePrintN(int n)
    {
        if (n > 0)
        {
            System.out.println("hello world");
            recursivePrintN(n-1);
        }
//        else
//            return;
    }

    public static int iterativeFibonacci(int index)
    {
        if(index == 0 || index == 1)
            return index;
        int a = 0, b = 1, c = -1;
        for(int i=1; i<index; i++)
        {
            c = a + b;
            a = b; b = c;
        }
        return c;
    }


    static int iter_find(int[] arr, int key)
    {

        // time analysis: O(N)
        // space analysis: O(1)
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    static void test_iter_find()
    {
        int[] arr = {9, 2, 5, 5, 2, 7, 4};
        System.out.print(iter_find(arr, 5));
    }


    static int rec_find(int[] arr, int key)
    {
        return rec_find(arr, key, 0);
    }

    static int rec_find(int[] arr, int key, int idx)
    {
        // time analysis: O(N)
        // space analysis: O(1)

        if (idx > arr.length)
            return -1;
        if (arr[idx] == key)
            return idx;
        return rec_find(arr, key, idx+1);
    }

    static void test_rec_find()
    {
        int[] arr = {9, 2, 5, 5, 2, 7, 4};
        System.out.print(iter_find(arr, 5));

        /**
         * F(0) = 2
         *  -> F(1) = 2
         *    -> F(2) = 2
         */
    }

    static int binary_search(int[] arr, int key)
    {
        return binary_search(arr, key, 0, arr.length - 1);
    }

    static int binary_search(int[] arr, int key, int low, int high)
    {
        // calculate middle index
        int mid = (low + high) / 2;

        // index out of bounds
        if (high < low)
            return -1;

        // match
        if (arr[mid] == key)
            return mid;

        // search upper bound
        if (arr[mid] < key)
            return binary_search(arr, key, mid+1, high);

        else
            // search lower bound
            return binary_search(arr, key, low, mid-1);

    }

    static void test_binary_search_find()
    {
        int[] arr = {2, 2, 4, 5, 5, 7, 9};
        System.out.print(iter_find(arr, 10));
    }

    public static void main(String[] args)
    {
        test_binary_search_find();
    }

}

