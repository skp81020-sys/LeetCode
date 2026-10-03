class Solution {
    static class Pair {
        String word;
        int freq;

        Pair(String word, int freq) {
            this.word = word;
            this.freq = freq;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Top of the heap = the "worst" candidate:
        // lower frequency, or on equal frequency the lexicographically larger word
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.freq != b.freq) {
                return a.freq - b.freq;
            }
            return b.word.compareTo(a.word);
        });

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            pq.add(new Pair(e.getKey(), e.getValue()));
            if (pq.size() > k) {
                pq.poll(); // evict the worst
            }
        }

        LinkedList<String> ans = new LinkedList<>();
        while (!pq.isEmpty()) {
            ans.addFirst(pq.poll().word); // heap pops worst-first, so build in reverse
        }
        return ans;
    }
}