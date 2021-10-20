package main.code.leetcode.list;

public class _876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }
}
