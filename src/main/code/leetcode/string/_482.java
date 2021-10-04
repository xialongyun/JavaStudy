package main.code.leetcode.string;

public class _482 {
    public String licenseKeyFormatting(String s, int k) {
        public String licenseKeyFormatting(String s, int k) {
            StringBuffer str = new StringBuffer();
            s = s.toUpperCase();
            int count = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != '-') {
                    str.insert(0, s.charAt(i));
                    count++;
                    if (count % k == 0) {
                        str.insert(0, '-');
                    }
                }
            }
            if(str.length() != 0 && str.charAt(0) == '-') {
                str.delete(0, 1);
            }
            return str.toString();
        }
    }
}
