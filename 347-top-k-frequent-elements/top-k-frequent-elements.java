public class Number implements Comparable<Number>{
    int element; 
    int frequency;
    Number(int element, int frequency){
        this.element = element;
        this.frequency = frequency;
    }
    public int compareTo(Number that){
        return that.frequency - this.frequency;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> freMap = new HashMap<>();

        for(int num : nums){
            freMap.put(num, freMap.getOrDefault(num, 0) + 1);  // hashmap was ready
        }

        for(Map.Entry<Integer, Integer> val : freMap.entrySet()){
            Number number = new Number(val.getKey(), val.getValue());
            pq.offer(number);
        }

        int[] result =new int[k];
        int i=0; 
        while(i < k){
            Number ans = pq.poll();
            result[i] = ans.element;
            i++;
        }
        return result;
        
    }
}