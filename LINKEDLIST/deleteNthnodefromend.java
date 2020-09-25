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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> res = new ArrayList<>();
        while(head != null) {
            res.add(head);
            head = head.next;
        }
        int x = res.size() - n;
        if(res.size() == 1) return null;
        else if(x == 0) return res.get(1);
        else{
            res.get(x-1).next  = res.get(x).next;
            return res.get(0);
    }
}
}