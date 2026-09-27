class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);

        int lo = 0;
        int hi = 0;

        while (hi < sb.length()) {
            char ch = sb.charAt(hi);
            if (ch == '(') {
                lo = hi;
            } else if (ch == ')') {
                StringBuilder a = new StringBuilder(sb.substring(0, lo));
                StringBuilder b = new StringBuilder(sb.substring(lo + 1, hi)).reverse();
                StringBuilder c = new StringBuilder(sb.substring(hi + 1));

                sb.setLength(0);
                sb.append(a).append(b).append(c);

                hi = lo + b.length();
                int tmp = lo - 1;
                while (tmp >= 0) {
                    if (sb.charAt(tmp) == '(') break;
                    tmp--;
                }
                lo = tmp;
                continue;
            }
            hi++;
        }

        return sb.toString();
    }
}