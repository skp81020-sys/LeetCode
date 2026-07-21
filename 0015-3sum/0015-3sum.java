class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
         int n=arr.length;
        Arrays.sort(arr);
        ArrayList<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i > 0 && arr[i]==arr[i-1]) continue;
            // by Usicg the two Pointer
            int j=i+1;
            int k=n-1;
            while (j < k) {
                if(arr[i]+arr[j]+arr[k]==0){
                    ArrayList<Integer> a=new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    a.add(arr[k]);
                    ans.add(a);
                    j++;
                    k--;
                    while(j <k && arr[j]==arr[j-1]) {
                        j++;
                    }
                }
                else if(arr[i]+arr[j]+arr[k] > 0){
                    k=k-1;
                }
                else{
                    j=j+1;
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j) +" ");
            }
            System.out.println();
        }
        return ans;
    }
}