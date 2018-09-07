package week01;


/**
 * The count say sequence starts with the string "1". Each following string is determined by reading out the count of
 * each repeating character and then the character itself. The following list shows the first 7 terms of the count say
 * sequence:
 *
 * 1 1
 * 2 11
 * 3 21
 * 4 1211
 * 5 111221
 * 6 312211
 * 7 13112221
 *
 */
class CountSay
{

    /**
     * This method generates the next term of the sequence given based on the supplied string.
     */
    static String countSay(String input)
    {
        return "";
    }

    /**
     * This method returns the nth term of the sequence
     */
    static String countSay(int n)
    {
        String term = "1";
        for(int i=1; i<n; i++)
            term = countSay(term);
        return term;
    }

    public static void main(String[] args)
    {
        // verify program arguments
        if (args.length < 1)
        {
            System.err.println("missing arguments");
            return;
        }

        // load arguments into local variable
        int n = Integer.parseInt(args[0]);

        // determine output
        String result = countSay(n);

        // print output
        System.out.println(result);

    }
}