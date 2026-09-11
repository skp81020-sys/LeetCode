class Solution {
    public int totalNumbers(int[] digits) {
        int nums[]=new int[10];

        int n=digits.length;
        for(int i=0;i<n;i++){
            nums[digits[i]]++;
        }
        int ans=0;
        for(int i=1;i<=9;i++){
            if(nums[i]==0) continue;
            nums[i]--;
            for(int  j=0;j<=9;j++){
                if(nums[j]==0) continue;
                 nums[j]--;

                 for(int k=0;k<=8;k=k+2){
                     if(nums[k]==0) continue;
                        ans++;
                 }
                  nums[j]++;
            }
             nums[i]++;
        }
        return ans;

    }
}