package main.code.leetcode.list;

import java.util.HashSet;
import java.util.Set;

public class _141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while(head != null) {
            if(!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
