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
    public int getDecimalValue(ListNode head) {
        ListNode currentnode = head;
        Stack<Integer> binarystack = new Stack<Integer>(); 
        int ans=0;
        int mult = 1;
        while(currentnode!= null){
            binarystack.add(currentnode.val);
            currentnode = currentnode.next;
        }
        
        while(!binarystack.isEmpty()){
            
            int x= binarystack.pop();
            ans+= mult * x;
            mult = mult * 2;
        }
        
        return ans;
        
    }
}