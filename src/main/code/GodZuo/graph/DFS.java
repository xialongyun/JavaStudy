package main.code.GodZuo.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS {
    public static void dfs(Node node) {
        if(node == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        Set<Node> set = new HashSet<Node>();
        stack.add(node);
        set.add(node);
        System.out.println(node.value);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            for(Node next : cur.nexts) {
                if(!set.contains(next)) {
                    stack.add(cur);
                    stack.add(next);
                    set.add(next);
                    System.out.println(next.value);
                    break;
                }
            }
        }
    }
}
