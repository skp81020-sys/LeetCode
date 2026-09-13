class Solution {
    class Pair{
        char ch;
        int count;
        Pair(char ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && st.peek().ch==s.charAt(i)){
                if(st.peek().count == k-1){
                    st.pop();
                }else{
                    int a=st.peek().count ;
                    st.pop();
                    st.push(new Pair(s.charAt(i),a+1));
                }
            }else{
                 st.push(new Pair(s.charAt(i),1));
            }
        }

        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            char h=st.peek().ch;
            int a=st.pop().count;
            while(a!=0){
                str.append(h);
                a--;
            }
        }

        return str.reverse().toString();
    }
}