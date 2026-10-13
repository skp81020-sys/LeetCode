class Solution {
    public int leastInterval(char[] tasks, int n) {
        int n1=tasks.length;
        int freq[]=new int[26];
         int ideal=0;
        for(int i=0;i<n1;i++){
            freq[tasks[i]-'A']++;
        }
        int a=0;    
        int ans=0;
        while(a < n1){
            Arrays.sort(freq);               
            int x = 0;
            for (int i = 25; i >= 0 && x < n + 1; i--) {   
                if (freq[i] > 0) {
                    a++;
                    x++;
                    freq[i]--;
                }
            }
            ans +=x;
            
             ideal=(n+1)-x;
            if(ideal > 0) ans +=ideal;
        }

        return ans- ideal;
    }
}