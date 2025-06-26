class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip duplicate
                current.next = current.next.next;
            } else {
                // Move forward if no duplicate was found
                current = current.next;
            }
        }
        return head;
    }
}
