class Solution {
    public List<List<Integer>> threeSum(int[]  arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(i> 0 && arr[i]==arr[i-1]) continue;

            int j=i+1;
            int k=n-1;

            while(j < k){
                if(arr[j]+arr[k] ==- arr[i]){
                   List<Integer> a = new ArrayList<>(List.of(arr[i], arr[j], arr[k])); 
                     ans.add(a);
                    j++;k--;
                    while (j < k && arr[j] == arr[j - 1]) j++;  
                    while (j < k && arr[k] == arr[k + 1]) k--;

                }else if(arr[k]+arr[j] < -arr[i]){
                    j++;
                }else{
                    k--;
                }
            }
        }

        return ans;
    }
}