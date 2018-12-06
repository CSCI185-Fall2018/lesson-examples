package week13;

class Main
{
    int getRange(int... arr)
    {
        int min = arr[0], max = arr[0];
        for(int x: arr)
        {
            if(x > max)
                max = x;
            if(x < min)
                min = x;
        }
        return max - min;
    }

    void draw(int width, int height)
    {
        boolean flag = true;
        for(int r=0; r<height; r++)
        {
            for(int c=0; c<width; c++)
            {
                // ternary operator
                // System.out.print(flag ? 'X' : 'O');
                if(flag)
                    System.out.print('X');
                else
                    System.out.print('O');
                flag = !flag;
            }
            System.out.println();
            flag = !flag;
        }
    }

    public static void main(String[] args)
    {
//        new Main().getRange();
//        int r = new Main().getRange(6, 5, 4, 7, 8, 3, 2, 9);
//        System.out.println(r); // 7

        new Main().draw(4, 5);
    }


}