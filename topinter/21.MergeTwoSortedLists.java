/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
    hint : 
    1.創立一個newhead;
    2.比較 l1,l2 node 看誰比較小，就讓 tmp 指向新newhead，並且找尋較小的list
    3.指向後，需要把小的list 跟 tmp 的list做更新 (next)
    4.最後若有一個list到null後，讓newhead直接指向尚未到底的list即可
    
*/
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                tmp.next = l1 ; 
                l1 = l1.next;
            }
            else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if(l1 == null) {
            tmp.next = l2;
        }
        else 
            tmp.next = l1;
        return head.next;
    }
    
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode tmp = null;
         if(l1 == null)
            return l2;
         if(l2 == null)
             return l1;
         if(l1.val < l2.val){
             tmp  = l1;
             tmp.next = mergeTwoLists(l1.next, l2);
         }
         else {
             tmp = l2;
             tmp.next = mergeTwoLists(l1, l2.next);
         }
         return tmp;
     }
}
