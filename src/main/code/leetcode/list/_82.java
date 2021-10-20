package main.code.leetcode.list;

public class _82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = new ListNode(0);
        list.next = head;
        ListNode cur = list;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int p = cur.next.val;
                while (cur.next != null && cur.next.val == p) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return list.next;
    }
}
