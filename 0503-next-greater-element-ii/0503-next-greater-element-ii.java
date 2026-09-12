class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            s.push(nums[i]);
        }
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= nums[i]) s.pop();
            if(s.isEmpty()) ans[i]=-1;
            else ans[i]=s.peek();
            s.push(nums[i]);
        }
        return ans;
    }
}