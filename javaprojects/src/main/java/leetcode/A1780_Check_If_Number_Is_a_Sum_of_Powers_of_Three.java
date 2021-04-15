package leetcode;

/*
Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.
An integer y is a power of three if there exists an integer x such that y == 3x.

Example 1:

Input: n = 12
Output: true
Explanation: 12 = 31 + 32
Example 2:

Input: n = 91
Output: true
Explanation: 91 = 30 + 32 + 34
Example 3:

Input: n = 21
Output: false
*/

/*
Runtime: 1 ms, faster than 43.45% of Java online submissions for Check if Number is a Sum of Powers of Three.
Memory Usage: 35.7 MB, less than 62.32% of Java online submissions for Check if Number is a Sum of Powers of Three.
*/

public class A1780_Check_If_Number_Is_a_Sum_of_Powers_of_Three {
    
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
        System.out.println(checkPowersOfThree(91));
        System.out.println(checkPowersOfThree(21));
    }
    
    public static boolean checkPowersOfThree(int n) {
        int maxRoot = (int) Math.cbrt(n);
        return check(n, maxRoot);
    }

    public static boolean check (int n, int multiple){
        int sub = (int) Math.pow(3,multiple);

        if (n == 0) return true;
        if (multiple < 0 ) return false;

        int ret = (n >= sub)? (n - sub) : n;
        
        return check(ret, multiple-1);
    }
}
