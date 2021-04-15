package leetcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void twoSum_1()
    {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] output = {0,1};

        assertEquals(0, Arrays.compare(output, A0001_TwoSum.twoSum(arr, target)));
    }

    @Test
    public void twoSum_2()
    {
        int[] arr = {3,2,4};
        int target = 6;
        int[] output = {1,2};

        assertEquals(0, Arrays.compare(output, A0001_TwoSum.twoSum(arr, target)));
    }

    @Test
    public void twoSum_3()
    {
        int[] arr = {3,3};
        int target = 6;
        int[] output = {0,1};

        assertEquals(0, Arrays.compare(output, A0001_TwoSum.twoSum(arr, target)));
    }
}
