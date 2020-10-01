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
        
        if(head ==null){
            return 0;
        }
        int res = 0;
        while(head!=null){
            if(head.val==1){
                res = (res << 1) +   1;
            }
            else{
                
                res = (res << 1) +   0;
            }
            
            head = head.next;
        }
        return res;
    }
}