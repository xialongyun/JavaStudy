package main.code.leetcode.list;

public class _19 {
    /**
     * 双指针
     * */
    public ListNode removeNthFromEnd0(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode curr = dummyHead;
        ListNode low = curr;
        ListNode fast = curr;
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            low = low.next;
            fast = fast.next;
        }
        low.next = low.next.next;
        return dummyHead.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
