class Solution {
    int n;
    int memo[][];
    int findmethod(int nums[],int lo,int target){
        int hi=n-1;
        int res=-1;
        while(lo <= hi){
            int mid=lo +(hi-lo)/2;
            if(nums[mid]==target) {
                res=mid;
                hi=mid-1;
            }
            if(nums[mid] < target) lo=mid+1;
            else hi=mid-1;
        }

        return res;
    }
    int solve(int i ,int inc,int[] nums){
         
        if(memo[i][inc] != -1) return memo[i][inc];

        int cur=nums[i]+inc;
        int len=1;

        int j=findmethod(nums,i+1,cur+1);
        if(j !=-1){
            len =Math.max(len ,1 + solve(j,0,nums));
        }
        j =j=findmethod(nums,i+1,cur);
         if(j !=-1){
            len =Math.max(len ,1 + solve(j,1,nums));
        }
        return memo[i][inc] = len;
    }
    public int maxSelectedElements(int[] nums) {
         n=nums.length;
        Arrays.sort(nums);
        int res=1;
        memo=new int[n+1][2];
        for(int i=0;i<n;i++){
            memo[i][0]=-1;
             memo[i][1]=-1;
        }
        for(int i=0;i<n;i++){
           int a= solve(i,0,nums);
           int b= solve(i,1,nums);
           res = Math.max(res, Math.max(a, b));
        }
        return res;

    }
}