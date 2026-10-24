class Solution {
    

     void Generate(String digits, List<String> ans, StringBuilder d, int n, int idx, HashMap<Character,String> hs) {
        if (idx == n) {
            ans.add(d.toString());
            return;
        }
        String t = hs.get(digits.charAt(idx));
        for (int i = 0; i < t.length(); i++) {
            d.append(t.charAt(i));
            Generate(digits, ans, d, n, idx + 1, hs);
            d.deleteCharAt(d.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> hs = new HashMap<>();
        hs.put('2', "abc");
        hs.put('3', "def");
        hs.put('4', "ghi");
        hs.put('5', "jkl");
        hs.put('6', "mno");
        hs.put('7', "pqrs");
        hs.put('8', "tuv");
        hs.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
        StringBuilder d = new StringBuilder();
        int n = digits.length();
        Generate(digits, ans, d, n, 0, hs);
        return ans;
    }
}