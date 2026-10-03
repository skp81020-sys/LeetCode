class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            // if(st.size() < 2 && ch==')') st.push(i);
            // else if(ch==')'){
            //     st.pop();
            //     ans =Math.max(ans,(i-st.peek()));
            // }else st.push(i);

            if(ch=='(') st.push(i);
            else{
                st.pop();
                if(st.isEmpty()) st.push(i);
                ans =Math.max(ans,(i-st.peek()));
            }
        }

        return ans;
    }
}