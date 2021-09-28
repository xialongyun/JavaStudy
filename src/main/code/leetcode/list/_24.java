package main.code.leetcode.list;

public class _24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;

        while(temp.next != null && temp.next.next != null) {
            ListNode low = temp.next;
            ListNode fast = temp.next.next;
            temp.next = fast;
            low.next = fast.next;
            fast.next = low;
            temp = low;
        }
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
