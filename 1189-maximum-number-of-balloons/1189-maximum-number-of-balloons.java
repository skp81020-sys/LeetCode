class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[256];
        int n=text.length();

        for(int i=0;i<n;i++){
            char ch =text.charAt(i);
            arr[ch]++;
        }

        int ba= Math.min(arr['b'],arr['a']);
        int lo=Math.min(arr['l']/2 , arr['o']/2);

        return Math.min(ba,Math.min(lo,arr['n']));
    }
}