class Solution {
    public  void Generate(int n,ArrayList<String> arr,int o,int c,StringBuilder curr){
        if(o==n && c==n){
            arr.add(curr.toString());
            return;
        }
        if(o < n){
            Generate(n,arr,o+1,c,curr.append('('));
             curr.deleteCharAt(curr.length()-1);
             
        }
        if(o > c){
             Generate(n,arr,o,c+1,curr.append(')'));
              curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<>();
         Generate(n,arr,0,0,new StringBuilder());
         return arr;
    }
}