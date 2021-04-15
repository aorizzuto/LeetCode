package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class A0043_Tests 
{
    @ParameterizedTest
    @CsvSource({ "123,24,2952","3,4,12","0,234,0","123,456,56088","12,12,144","999,999,998001",
                 "111,2234,247974","1,5342,5342" }) //
    public void Test(String a , String b,String result)
    { assertEquals(result, A0043_Multiply_Strings.multiply(a,b)); }

}




        

        