/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node curr = head;
        while(curr != null) {
            Node node = new Node(curr.val);
            node.next = curr.next;
            curr.next = node;
            curr = curr.next.next;
        }
        
        curr = head;
        while(curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        
        curr = head;
        Node copyhead = curr.next;
        Node copy = copyhead;
        while( copy.next != null){
            curr.next = curr.next.next;
            curr = curr.next;
            
            copy.next = copy.next.next;
            copy = copy.next;
        }
        curr.next = curr.next.next; 
        return copyhead;
    
    
    }
}