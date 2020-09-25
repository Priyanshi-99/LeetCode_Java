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
      // Your code here
          boolean ans = false;
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            arr1.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(arr);
       if(arr1.equals(arr)){
           ans = true;
       }
        return ans;
    }
}
        
    