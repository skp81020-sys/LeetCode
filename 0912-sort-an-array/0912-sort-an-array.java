class Solution {
    // Hepify and to crate the max heap
    public static void Heapify(int arr[],int i,int n){
        int left=2*i+1;
        int right=2*i+2;
        int max=i;
        // left ke liye 
        if(left <  n && arr[left] > arr[max]){
            // swap kar do
           max=left;
        }

        // right ke liye 
        if(right < n && arr[right] > arr[max]){
            max=right;
        }

        //arr[max] or arr[i] swapping kar do 
       if(max !=i){
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;

            Heapify(arr,max,n);
       } 
    }
     public static void HeapSort(int arr[]){
        // Create max heap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
             Heapify(arr, i, n);
        }

        //  first element ko last me add kar do 
        for(int i=n-1;i>=0;i--){
            // swap to last and first 
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            Heapify(arr,0,i);
        }
    }   

    public int[] sortArray(int[] nums) {
         HeapSort(nums);

         return nums;
    }
}