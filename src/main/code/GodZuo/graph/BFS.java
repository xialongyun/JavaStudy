package main.code.GodZuo.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public static void bfs(Node node) {
        if(node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> set = new HashSet<Node>();
        queue.add(node);
        set.add(node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.value);
            for(Node next : cur.nexts) {
                if(!set.contains(next)) {
                    set.add(next);
                    queue.add(next);
                }
            }

        }
    }
}


