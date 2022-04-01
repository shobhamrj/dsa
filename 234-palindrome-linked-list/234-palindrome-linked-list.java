/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHalfHead = reverse(slow.next);
        ListNode firstHalfHead = head;
        
        while(firstHalfHead != null && secondHalfHead != null) {
            if(firstHalfHead.val != secondHalfHead.val)
                return false;
            secondHalfHead = secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode newHead = null;
        while(head != null) {
            ListNode headNext = head.next;
            head.next = newHead;
            newHead = head;
            head = headNext;
        }
        return newHead;
    }
}