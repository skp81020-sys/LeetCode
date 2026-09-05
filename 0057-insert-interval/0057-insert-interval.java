class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int nums[][]=new int[n+1][2];

        // Copy the intervals in nums and new intervals 
        for(int i=0;i<n;i++){
            nums[i][0]=intervals[i][0];
            nums[i][1]=intervals[i][1];
        }
        nums[n][0]=newInterval[0];
        nums[n][1]=newInterval[1];
        n=n+1;
        int ans[][]=new int[n][2];
        int a=0;
        Arrays.sort(nums,(c,b) -> c[0]-b[0]);
        for(int i=0;i<n;i++){
            int s=nums[i][0];
            int e=nums[i][1];

            while(i+1 < n && e >=nums[i+1][0]){
                e=Math.max(e,nums[i+1][1]);
                i++;
            }
            ans[a][0]=s;
            ans[a][1]=e;
            a++;
        }

        return Arrays.copyOf(ans, a);
    }
}