package week08;

import org.junit.Test;
import static org.junit.Assert.*;

public class SorterTest
{

    @Test
    public void test_hello()
    {
        assertEquals(1, 1);
    }

    @Test
    public void test_sort()
    {
        int[] array = {5, 3, 7, 4, 3};
        Sorter sorter = new Sorter(array);
        sorter.sort();
        int[] expected = {3, 3, 4, 5, 7};
//        assertEquals(expected, array);
        assertArrayEquals(expected, array);


        /**
         *
         * A: [5, 3, 7, 4, 3]   C=0 M=1
         * A: [3| 5, 7, 4, 3]   C=1 M=4
         * A: [3, 3| 7, 4, 5]
         */
    }

    @Test
    public void test_swap()
    {
        // setup
        int[] array = {5, 3, 7, 4, 3};
        int[] expected = {4, 3, 7, 5, 3};
        Sorter sorter = new Sorter(array);

        // invoke
        sorter.swap(0, 3);

        // assert
        assertArrayEquals(expected, array);
    }

    @Test
    public void test_min()
    {
        // setup
        int[] array = {5, 3, 7, 4, 3};
        int expected = 1;
        Sorter sorter = new Sorter(array);

        // invoke
        int actual = sorter.min(0);

        // assert
        assertEquals(expected, actual);
    }

}
