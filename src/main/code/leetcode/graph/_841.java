package main.code.leetcode.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int N = rooms.size();
        boolean[] keys = new boolean[N];
        keys[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        for (int x : rooms.get(0)) {
            queue.add(x);
            if (keys[x] == false) {
                keys[x] = true;
            }
        }
        while (!queue.isEmpty()) {
            int j = queue.poll();
            for (int x : rooms.get(j)) {
                if (keys[x] == false) {
                    keys[x] = true;
                    queue.add(x);
                }
            }
        }
        for(boolean y : keys) {
            if(!y) {
                return false;
            }
        }
        return true;
    }
}
