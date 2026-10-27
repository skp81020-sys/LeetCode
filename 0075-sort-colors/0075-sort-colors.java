class Solution {
    public void sortColors(int[] nums) {
        int fre[]=new int[3];
        int n=nums.length;
        for(int i=0;i<n;i++){
            fre[nums[i]]++;
        }
        int a=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<fre[i];j++){
                nums[a++]=i;
            }
        }
    }
}