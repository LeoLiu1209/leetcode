/*
Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:
a1->a2
          ->c1->c2->c3
b1->b2->b3

begin to intersect at node c1.

hints : 
1.一起走到最後一個結點，最後一個必定相同，然後邊走邊記錄各自的長度
2.兩長度互減，更新長的index
3.兩者一起走看哪時後兩個會相等，相等後回傳值
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode h1 = headA;
        ListNode h2 = headB;
        int lenA = 1;
        int lenB = 1;
        while(h1.next != null) {
            lenA++;
            h1 = h1.next;
        }
        while(h2.next != null) {
            lenB++;
            h2 = h2.next;
        }
        if(h1 != h2)
            return null;
        else {
            int distance = Math.abs(lenA - lenB);
            if(lenA >= lenB) {
                h1 = headA;
                h2 = headB;
            }else {
                h1 = headB;
                h2 = headA;
            }
            for(int i=0; i<distance; i++)
                h1 = h1.next;
            while(h1 != null && h2 != null && h1 != h2) {
                h1 = h1.next;
                h2 = h2.next;
            }
        }
        return h1;
    }
}
