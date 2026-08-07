class Solution {
    public void nextPermutation(int[] arr) {
         int n=arr.length-1;
        int pivot=-1;
        for(int i=0;i<n;i++){
            if(arr[i] < arr[i+1]){
                pivot=i;
                 
            }
        }
        // if array  are sorted 
        if(pivot==-1){
            int i=0;
            int j=n;
            while(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }else{
            // pivot se agte koi elemnt pivot se pda hai the swap
            for(int i=n;i>pivot;i--){
                if(arr[pivot] < arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[pivot];
                    arr[pivot]=temp;
                    break;
                }
            }
            // revertse kar do pivot +1 se n
            int i=pivot+1;
            int j=n;
            while( i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
}