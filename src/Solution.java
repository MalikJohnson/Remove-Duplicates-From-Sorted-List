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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current!=null && current.next !=null){
            if(current.val == current.next.val){
                //skip duplicate
                current.next = current.next.next;
            }
            //move pointer up
            current = current.next;
        }
        return head;
    }
}