package main.code.leetcode.string;

public class _9 {
    /**
     *   int 转 String，然后使用双指针
     **/
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;   //负数不是回文数，直接返回false
        }
        String str = Integer.toString(x);   //int 转 String，然后使用双指针
        int length = str.length();
        int left = 0;
        int right = length - 1;
        while (left != length / 2 + 1 ) {   //终止条件为左指针到达中点或中点+1
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
