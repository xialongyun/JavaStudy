package main.code.leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class _1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        int[] in = new int[n];
        for (int i = 0; i < edges.size(); i++) {
            in[edges.get(i).get(1)]++;
        }
        for (int i = 0; i < n; i++) {
            if (in[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
