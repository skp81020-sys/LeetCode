class Solution {
    public boolean isValid(String str) {
         Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty()) return false;
                if(str.charAt(i)==')' && s.peek() =='(') s.pop();
                else if(str.charAt(i)==']' && s.peek() =='[') s.pop();
                else if(str.charAt(i)=='}' && s.peek() =='{') s.pop();
                else s.push(str.charAt(i));

            }   
        }
        return s.isEmpty();
    }
}