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
        ListNode pointer1 = headA;
        ListNode pointer2 = headB;
        
        while(pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
            if(pointer1 == pointer2)
                return pointer1;
            if(pointer1 == null)
                pointer1 = headB;
            if(pointer2 == null)
                pointer2 = headA;
            
        }
        
        return pointer1;

        
    }
}