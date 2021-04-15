package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class A1518_Tests 
{
    @ParameterizedTest
    @CsvSource({ "13,9,3","19,15,4","6,5,5","2,2,3" }) //
    public void Test(int result, int fullBottles, int numExchange)
    { assertEquals(result, A1518_WaterBottles.numWaterBottles(fullBottles, numExchange)); }

}
