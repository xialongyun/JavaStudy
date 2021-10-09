package main.code.leetcode.list;

public class _2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int pre = 0;
        while (l1 != null || l2 != null) {
            if(l1 == null) {
                l1 = new ListNode();
                l1.val = 0;
            }
            if(l2 == null) {
                l2 = new ListNode();
                l2.val = 0;
            }
            cur.next = new ListNode();
            cur.next.val = (l1.val + l2.val + pre) % 10;
            pre = (l1.val + l2.val + pre) / 10;
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        if (pre != 0) {
            cur.next = new ListNode();
            cur.next.val = pre;
        }
        return result.next;
    }
}
