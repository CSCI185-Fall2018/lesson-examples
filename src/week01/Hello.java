package week01;

class Hello
{
    static void hello(String message, int count)
    {
        for(int i=0; i<count; i++)
            System.out.println(message);
    }

    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.err.println("needs two arguements");
            return;
            //System.exit(1);
        }

        String message = args[0];
        int count = Integer.parseInt(args[1]);

        hello(message, count);

//        for(String arg: args)
//            System.out.println(arg);
    }
}