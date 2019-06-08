/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
Given linked list -- head = [4,5,1,9]

連結陣列1 -> 2 -> 3 -> 4 ，傳入3，則執行後連節陣列變成1 -> 2 -> 4

hint:
 將val:3節點的值用val:4取代，並將node.next指向val:5節點，本來val:4的記憶體空間就會被釋放出來

*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = ndoe.next.next;
    }
}
