class Solution {
    public List<String> fizzBuzz(int n) {
        String a="FizzBuzz";
        String b="Fizz";
        String c="Buzz";
        List<String> ans =new  ArrayList<>();
        for(int i=0;i<n;i++){
            int x=i+1;
            if(x % 5==0 && x%3==0){
                ans.add(a);
            }else if(x % 3==0){
                ans.add(b);
            }else if(x % 5==0){
                ans.add(c);
            }else ans.add(String.valueOf(x));
        }

        return ans;
    }
}