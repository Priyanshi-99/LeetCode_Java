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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<ListNode>();
        if(head == null){
            return null;
        }
        ListNode curr = head;
        
        while(curr.next!=null){
            st.push(curr);
            curr = curr.next;
        }
    head = curr;  
    while (!st.isEmpty()) 
    {  
        curr.next = st.peek();  
        curr = curr.next;  
        st.pop();  
    }  
    curr.next = null;  
        return head;
       
    }
}