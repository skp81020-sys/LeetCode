class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[3];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int a=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i];j++){
                nums[a++]=i;
            }
        }
    }
}