class Solution {
    // to functio the sort the String
    public static String sortString(String s){
        char[] charArray =  s.toCharArray();
        Arrays.sort(charArray);

        return  new String(charArray);
    }
    public List<List<String>> groupAnagrams(String[] str) {
        ArrayList<List<String>> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int a=0;
        for(int i=0;i<str.length;i++){
            String temp=sortString(str[i]);

            if(map.containsKey(temp)){
                ans.get(map.get(temp)).add(str[i]);
            }else{
               map.put(temp, a++);
                ans.add(new ArrayList<>());
                ans.get(map.get(temp)).add(str[i]);
            }
        }
        return  ans;
    }
}