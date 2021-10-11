package main.code.leetcode.string;

public class _415 {
    public static void main(String[] args) {
        System.out.println(addStrings("123","4567"));
    }
    public static String addStrings(String num1, String num2) {
        num1 = new StringBuffer(num1).reverse().toString();
        num2 = new StringBuffer(num2).reverse().toString();
        int l1 = num1.length();
        int l2 = num2.length();
        StringBuffer num = new StringBuffer(Math.max(l1, l2));
        int pre = 0;
        for (int i = 0; i < Math.max(l1, l2); i++) {
            int n1 = i >= l1 ? 0 : Integer.parseInt(String.valueOf(num1.charAt(i)));
            int n2 = i >= l2 ? 0 : Integer.parseInt(String.valueOf(num2.charAt(i)));
            System.out.println("n1: " + n1 + "n2: " + n2);
            num.append((n1 + n2 + pre) % 10);
            pre = (n1 + n2 + pre) / 10;
        }
        if (pre != 0) {
            num.append(pre);
        }
        return num.reverse().toString();
    }
}
