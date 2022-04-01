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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) 
            return head;
        ListNode middle = getMiddle(head);      
        ListNode leftHead = head;
        ListNode rightHead = middle.next; 
        middle.next = null;            
    return merge(sortList(leftHead), sortList(rightHead));
    }
    
    public  ListNode merge(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode curr = newHead;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2 : l1;
        return newHead.next;
        
        
    }

    
    
    public ListNode getMiddle(ListNode head) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    
    
}