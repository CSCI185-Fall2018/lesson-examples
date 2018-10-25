package week08;

public class Sorter
{

    private int[] array;

    public Sorter(int[] array)
    {
        this.array = array;
    }

    public void sort()
    {
        // selection sort
        for(int i=0; i<array.length; i++)
        {
            int j = min(i);
            swap(i, j);
        }
    }

    public void swap(int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int min(int start)
    {
        int min_index = start;
        for(int i=start; i<array.length; i++)
        {
//            int value = array[i];
//            int min_value = array[min_index];
            if (array[i] < array[min_index])
                min_index = i;
        }
        return min_index;
    }

}
