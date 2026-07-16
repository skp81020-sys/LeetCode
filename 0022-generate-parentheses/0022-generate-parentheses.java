class Solution {
    public static void generate(int n,int open,String curr,ArrayList<String> arr){
    // Base Case 
    if(curr.length() == 2*n){
        arr.add(curr);
        return;
    }

    if(open < n){
        generate(n, open+1, curr+'(', arr);
    }

    if(curr.length() -open <open){
          generate(n, open, curr+')', arr);
    }
}
    public List<String> generateParenthesis(int n) {
         ArrayList<String> arr = new ArrayList<>();
        generate(n,0,"",arr);
        return arr;
    }
}