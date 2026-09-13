class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        for (char ch : num.toCharArray()) {

            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }

        // Agar abhi bhi k digits remove karne hain
        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        ans.reverse();

        // Leading zeros remove
        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        if (i == ans.length()) {
            return "0";
        }

        return ans.substring(i);
    }
}