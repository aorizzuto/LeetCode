package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class A0001_Tests 
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
