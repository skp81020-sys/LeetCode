class Solution {
    int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int findDate(String s) {
        int m = Integer.parseInt(s.substring(0, 2));
        int d = Integer.parseInt(s.substring(3));
        int ans = 0;
        for (int i = 0; i < m - 1; i++) {
            ans += arr[i];
        }
        return ans + d;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa = findDate(arriveAlice);
        int al = findDate(leaveAlice);
        int ba = findDate(arriveBob);
        int bl = findDate(leaveBob);

        int overlap = Math.min(al, bl) - Math.max(aa, ba) + 1;
        return Math.max(0, overlap);
    }
}