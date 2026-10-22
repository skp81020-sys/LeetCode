class Solution {
    public  void Generate(int n,ArrayList<String> arr,int o,int c,String curr){
        if(o==n && c==n){
            arr.add(curr);
            return;
        }
        if(o < n){
            Generate(n,arr,o+1,c,curr+'(');
        }
        if(o > c){
             Generate(n,arr,o,c+1,curr+')');
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<>();
         Generate(n,arr,0,0,"");
         return arr;
    }
}