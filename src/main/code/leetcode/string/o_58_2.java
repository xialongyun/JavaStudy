package main.code.leetcode.string;

public class o_58_2 {

    /**
     *  遍历拼接_1
     *  常规
    * */
    public static String reverseLeftWords1(String s, int n) {
        StringBuilder str = new StringBuilder();
        int length = s.length();
        for(int i = n; i < length; i++) {
            str.append(s.charAt(i));
        }
        for(int i = 0; i < n; i++) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    /**
     *  遍历拼接_2
     *  利用求余运算简化
     * */
    public static String reverseLeftWords2(String s, int n) {
        StringBuilder str = new StringBuilder();
        int length = s.length();
        for(int i = n; i < n + length; i++) {
            str.append(s.charAt(i % length));
        }
        return str.toString();
    }

    /**
     *  切片函数subString
     *  subString(int startIndex, int endIndex)
     *  subString(int startIndex)
     * */
    public static String reverseLeftWords3(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    /**
     *  列表遍历拼接_1
     *  只能用 String
     * */
    public static String reverseLeftWords4(String s, int n) {
        String str = new String();
        int length = s.length();
        for(int i = n; i < length; i++) {
            str += s.charAt(i);
        }
        for(int i = 0; i < n; i++) {
            str += s.charAt(i);
        }
        return str.toString();
    }

    /**
     *  列表遍历拼接_2
     *  只能用 String
     *  利用求余运算简化
     * */
    public static String reverseLeftWords5(String s, int n) {
        String str = new String();
        int length = s.length();
        for(int i = n; i < n +length; i++) {
            str += s.charAt(i % length);
        }
        return str.toString();
    }
}
