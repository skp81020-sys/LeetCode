class Solution {
    public int[][] merge(int[][] nums) {
        int n=nums.length;
        int ans[][]=new int[n+1][2];
        int a=0;
       Arrays.sort(nums, (c, b) -> c[0] - b[0]);
        for(int i=0;i<n;i++){
            int start=nums[i][0];
            int end=nums[i][1];

            while(i+1 < n && end >= nums[i+1][0]){
                end=Math.max(end , nums[i+1][1]);
                i++;
            }
            ans[a][0]=start;
            ans[a][1]=end;
            a++;
        }

        return Arrays.copyOf(ans, a);
    }
}