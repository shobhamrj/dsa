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
    
    public  ListNode midNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f.next != null && f.next.next != null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public void merge(ListNode head, ListNode head2) {
        ListNode curr1 = head;
        ListNode curr2 = head2;
        while(curr2 != null) {
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;
            curr1.next = curr2;
            curr2.next = next1;
            curr1 = next1;
            curr2 = next2;
        }
    }

    
    public void reorderList(ListNode head) {
        ListNode mid = midNode(head);
        ListNode next = mid.next;
        mid.next = null;
        ListNode head2 = reverse(next);
        merge(head, head2);
    }
}