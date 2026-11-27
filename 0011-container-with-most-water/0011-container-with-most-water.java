class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int s=0;
        int e=n-1;
        int ans =Integer.MIN_VALUE;
        while(s < e){
            int size=e-s;
            int a=Math.min(height[s],height[e]);
            ans=Math.max(ans,a*size);
            System.out.println(ans);
            if(height[s] < height[e]) s++;
            else e--;
        }
        return ans;
    }
}