package leetcode;

/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"   Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"   Output: "56088"

Constraints:
1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.
*/

public class A0043_Multiply_Strings {

    public static void main(String[] args) {
        String str = "123,456,56088";
        String[] s = str.split(",");
        multiply(s[0],s[1]);
    }

    public static String multiply(String num1, String num2) {
        int extra = 0;
        String arr[] = new String[num2.length()];
        String str, zeros="";

        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        for (int i = num2.length()-1; i >= 0; i--) {   // For each char in num2
            str = "";
            for (int j = num1.length()-1; j >= 0; j--) { // for each char in num1
                int val = Character.getNumericValue(num1.charAt(j))*Character.getNumericValue(num2.charAt(i)) + extra;
                
                extra = val/10;
                val %= 10;
                str = Integer.toString(val)+str;
            }   
            for (int j = 0; j < num2.length()-1-i; j++) {
                zeros += "0";
            }
            arr[i] = (extra!=0?Integer.toString(extra):"") + str + zeros;
            zeros = "";
            extra = 0;
        }

        str = "";
        int total=0;
        
        for (int i = 0; i < arr[0].length(); i++) {
            for (String s:arr) {
                try{
                    total += Character.getNumericValue(s.charAt(s.length()-1-i));
                }catch(Exception e){
                    continue;
                }
            }
            total += extra;
            extra = total/10;
            total %= 10;
            str = Integer.toString(total)+str;
            total = 0;
        }

        str = (extra!=0?Integer.toString(extra):"") + str;
        
        return str;
    }
}
