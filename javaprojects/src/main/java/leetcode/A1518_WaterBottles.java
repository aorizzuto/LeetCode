package leetcode;

/*
Given numBottles full water bottles, you can exchange numExchange empty water bottles for one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Return the maximum number of water bottles you can drink.

Example 1:

Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
*/

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Water Bottles.
Memory Usage: 35.8 MB, less than 43.71% of Java online submissions for Water Bottles.
*/


public class A1518_WaterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {     
        int totalDrink = 0;
        return DrinkBottles(numBottles, 0, numExchange, totalDrink); 
    }

    public static int DrinkBottles(int fullBottles, int emptyBottles, int numExchange, int totalDrink){
        totalDrink += fullBottles; // Drink the full bottles I have

        if (fullBottles + emptyBottles < numExchange) return totalDrink;

        return DrinkBottles((fullBottles+emptyBottles)/numExchange, (fullBottles+emptyBottles)%numExchange, numExchange, totalDrink);
    }
}