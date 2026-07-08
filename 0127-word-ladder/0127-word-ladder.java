class Solution {
    public  List<String>  neighbhours(String  word, HashSet<String> set){
        List<String> neighbhours=new ArrayList<>();

        for(int i=0;i<word.length();i++){
            for(char ch='a';ch <='z';ch++){
                if(ch!=word.charAt(i)){
                    String newWord=word.substring(0,i)+ch+word.substring(i+1);
                    if(set.contains(newWord)){
                         neighbhours.add(newWord);
                    }
                }
            }
        }
        return  neighbhours;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       HashSet<String> set=new HashSet<>(wordList); 
       if(!set.contains(endWord)){
            return 0;
       }
       Queue<String> q=new LinkedList<>();
       q.add(beginWord);
       if(set.contains(beginWord)){
            set.remove(beginWord);
       }

       int level=0;
       // Bfs travesal 
       while(!q.isEmpty()){
            int currSize=q.size();

            for(int i=0;i<currSize;i++){
                String  Node=q.remove();
                if(Node.equals(endWord)){
                    return level+1;
                }
            
            List<String> neighbhours=neighbhours(Node,set);
            for(String word:neighbhours){
                    q.add(word);
                    set.remove(word);
            }

           
            }
             level++;
       }

       return 0;
    }
}