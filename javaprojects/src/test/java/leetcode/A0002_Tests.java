package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class A0002_Tests 
{
    @Test
    public void AddTwoNumbers_1()
    {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode lret = new ListNode(7,new ListNode(0,new ListNode(8)));
        assertTrue(lret == A0002_AddTwoNumbers.addTwoNumbers(l1, l2));
    }

    @Test
    public void AddTwoNumbers_2()
    {
        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))));
        ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));
        ListNode lret = new ListNode(8,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(1))))))));
        assertEquals(lret, A0002_AddTwoNumbers.addTwoNumbers(l1, l2));
    }

    @Test
    public void AddTwoNumbers_3()
    {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode lret = new ListNode(0);
        assertEquals(lret, A0002_AddTwoNumbers.addTwoNumbers(l1, l2));
    }
}




        

        