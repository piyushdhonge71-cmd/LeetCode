public class CharFreq implements Comparable<CharFreq>{
    char ch;
    int freq;

    CharFreq(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }

    public int compareTo(CharFreq that){
        return that.freq - this.freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<CharFreq> pq = new PriorityQueue<>();
        HashMap<Character, Integer> freMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char ch :  s.toCharArray()){
            freMap.put(ch, freMap.getOrDefault(ch, 0) + 1);        // HashMap was ready
        }

        for(Map.Entry<Character, Integer> entry : freMap.entrySet()){
            CharFreq element = new CharFreq(entry.getKey(), entry.getValue());
            pq.offer(element);             // HashMap elements adding in PriorityQueue with sorted Frequency
        }

        while(!pq.isEmpty()){
            CharFreq ans = pq.poll();
            for(int i=0; i<ans.freq; i++){
                sb.append(ans.ch);          // adding PriorityQueue element into StringBuilder
            }
        }

        return sb.toString();           //StringBuilder to string
    }
}