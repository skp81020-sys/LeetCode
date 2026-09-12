class Solution {
    public int[] dailyTemperatures(int[]  nums) {
        int n=nums.length;
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()] <= nums[i]){
                s.pop();
            }
            if(s.isEmpty()) ans[i]=0;
            else ans[i]=s.peek()-i;
            s.push(i);
        }

        return ans;
    }
}