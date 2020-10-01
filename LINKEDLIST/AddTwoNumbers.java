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
    int carry=0;
     
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode res = new ListNode(0), ans = res;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
            res.next = addon(l1.val,l2.val);
            l1 = l1.next;
            l2 = l2.next;
                
            }
         
        
        else if(l1!=null){
            res.next = addon(l1.val,0);
            l1 = l1.next;
        }
        else if(l2!=null){
            res.next = addon(0,l2.val);
            l2 = l2.next;
        }
            res = res.next;
        }
        if(carry!=0) res.next = new ListNode(carry);
        return ans.next;
                  
    }
    public ListNode addon(int v1, int v2){
        int num = v1+v2+carry;
        carry = num/10;
        ListNode temp = new ListNode(num%10);
        return temp;
        
    }
}