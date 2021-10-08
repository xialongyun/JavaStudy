package main.code.leetcode.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        int l = s.length();
        if (l <= 10) {
            return result;
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= l - 10; i++) {
            String str = s.substring(i, i + 10);
            if (set.contains(str)) {
                result.add(str);
            } else {
                set.add(str);
            }
        }
        return result;
    }
}
