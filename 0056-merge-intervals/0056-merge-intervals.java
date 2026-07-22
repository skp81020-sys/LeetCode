class Solution {
    public int[][] merge(int[][] arr) {
        int n=arr.length;
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        Arrays.sort(arr, (a, b) -> a[0] - b[0]); // sort the to the 1st number
        for(int i=0;i<n;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            while(i + 1 < n && end >= arr[i+1][0]){
                end = Math.max(end, arr[i + 1][1]); 
                i++;
            }
            
           ArrayList<Integer> pair = new ArrayList<>();  // Bug 4 fix: proper ArrayList
            pair.add(start);
            pair.add(end);
            ans.add(pair);
        }
        n=ans.size();
        int ans2[][]=new int[n][2];
        for(int i=0;i<n;i++){
            ans2[i][0]=ans.get(i).get(0);
            ans2[i][1]=ans.get(i).get(1);
        }
        return ans2;
    }
}