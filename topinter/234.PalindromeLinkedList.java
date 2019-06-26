/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true

hint : 用 slow fast 指針，找到中點，接下來雙頭指針 從中點一個順 一個逆對照值
*/
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode mid = head.next, tail = head, pre = head;
        while(tail.next != null && tail.next.next != null) {
            tail = tail.next.next;
            head = mid;
            mid = mid.next;
            head.next = pre;
            pre = head;
        }
        //      head  mid tail
        // 1< 2 < 3    2  > 1
        if(tail.next == null) head = head.next; // 奇数的情况，那么就要将 head 前移移位
        while(mid != null) {
            if(head.val != mid.val) return false;
            mid = mid.next;
            head = head.next;
        }
        return true;
    }
}
