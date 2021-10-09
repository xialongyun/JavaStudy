package main.code.leetcode.list;

import java.util.HashSet;
import java.util.Set;

public class _142 {
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> set = new HashSet<ListNode>();
        while(pos != null) {
            if(set.contains(pos)) {
                return pos;
            }
            set.add(pos);
            pos = pos.next;
        }
        return null;
    }
}
