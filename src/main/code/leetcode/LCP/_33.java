package main.code.leetcode.LCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _33 {
//    public static void main(String[] args) {
//        int[] a = {1,3};
//        int[] b = {6,8};
//        storeWater();
//    }
//    public static int storeWater(int[] bucket, int[] vat) {
//        int ansUpgrate = 0;
//        int maxPour = Integer.MIN_VALUE;
//        for (int i = 0; i < bucket.length; i++) {
//            int[] result = min(bucket[i], vat[i]);
//            ansUpgrate += result[0];
//            if (result[1] > maxPour) {
//                maxPour = result[1];
//            }
//        }
//        return ansUpgrate + maxPour;
//    }
//    public static int[] min(int bucket, int vat) {
//        int[] result = new int[2];
//        int upgrade = 0;
//        int pour = Integer.MAX_VALUE;
//        int ans = upgrade + pour;
//        while (bucket < vat) {
//            bucket += upgrade;
//            pour = vat % bucket == 0 ? vat / bucket : vat / bucket + 1;
//            System.out.println("pour" + pour);
//            if (ans <= upgrade + pour) {
//                return result;
//            } else {
//                result[0] = upgrade;
//                result[1] = pour;
//                ans = upgrade + pour;
//                System.out.println("ans" + ans);
//            }
//            upgrade++;
//        }
//        return new int[] {0,1};
//    }
}
