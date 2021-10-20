package main.code.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class _43 {
    public static void main(String[] args) {
        System.out.println(multiply("3","21"));
    }
    public static String multiply(String num1, String num2) {
        char[] ch1 = new StringBuffer(num1).reverse().toString().toCharArray();
        char[] ch2 = new StringBuffer(num2).reverse().toString().toCharArray();
        int[] nums = new int[ch1.length];
        for (int i = 0; i < ch2.length; i++) {
            nums = add(nums,mul(ch1, ch2[i], i));
        }
        String result = "";
        for (int i = nums.length - 1; i >= 0; i--) {
            result = result + nums[i];
        }
        return result;
    }
    public static int[] mul(char[] chs, char ch, int p) {
        int[] result = new int[chs.length + 1 + p];
        int pre = 0;
        for (int i = 0; i < chs.length; i++) {
            result[i + p] = chs[i] - '0';
        }
        int num = Integer.parseInt(String.valueOf(ch));
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            result[i] = (temp * num + pre) % 10;
            System.out.println("mul"+"(" + i + "): " + result[i]);
            pre = (temp * num + pre) / 10;
        }
        result[chs.length] = pre;
        return result;
    }
    public static int[] add(int[] num1, int[] num2) {
        int l = Math.max(num1.length, num2.length);
        List<Integer> result = new ArrayList<>();
        int a = 0;
        int b = 0;
        int pre = 0;
        for (int i = 0; i < l; i++) {
            if (i < num1.length) {
                a = num1[i];
            } else {
                a = 0;
            }
            if (i < num2.length) {
                b = num2[i];
            } else {
                b = 0;
            }
            result.add((a + b + pre) % 10);

            System.out.println("add"  +"(" + i + "): " + (a + b + pre) % 10 );

            pre = (a + b + pre) / 10;
        }
        if (pre != 0) {
            result.add(pre);
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
