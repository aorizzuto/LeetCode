package leetcode;

/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Input: l1 = [0], l2 = [0]
Output: [0]

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/

public class A0002_AddTwoNumbers {
    
    public static void main(String[] args) {
        // ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        // ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));

        // ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,
        // new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))));
        // ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9,
        // new ListNode(9))));

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        addTwoNumbers(l1,l2);
    }
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lret = new ListNode();
        add(lret, l1, l2, 0);
        return lret;
    }

    public static void add(ListNode aux, ListNode l1, ListNode l2, int extra){
    
        int val = l1.val + l2.val + extra;
        extra = val/10;
        aux.val = val - extra*10;

        if (l1.next == null && l2.next == null) {
            if(extra != 0){
                aux.next = new ListNode(extra);
            }
            return;               
        }

        aux.next = new ListNode();

        if (l1.next == null){
            add(aux.next, new ListNode(0), l2.next, extra);
            return;
        }else if (l2.next == null){
            add(aux.next, l1.next, new ListNode(0), extra);
            return;
        }
        add(aux.next, l1.next, l2.next, extra);
              
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
Memory Usage: 39.1 MB, less than 80.59% of Java online submissions for Add Two Numbers.
*/