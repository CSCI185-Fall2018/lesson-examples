package week01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountSayTest
{

    @Test
    public void test_count_say_helper()
    {
        String[] inputs =  {"1", "11", "111", "12", "133"};
        String[] outputs = {"11", "21", "31", "1112", "1123"};

        for(int i=0; i<inputs.length; i++)
        {
            String input = inputs[i];
            String expected = outputs[i];
            String actual = CountSay.countSay(input);
            assertEquals(expected, actual);
        }
    }

}