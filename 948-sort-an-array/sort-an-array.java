class Solution {

    public class myHeap{
        int heapSize;
        int[] heap;

        myHeap(int[] arr){
            heapSize = arr.length;
            heap = arr;
        }

        public void buildTree(){
        //leaf node starts from N/2 to N-1
        for(int i=heapSize/2 - 1; i>=0; i--){
            heapify(i);
        }
    }
    public  void heapify(int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < heapSize && heap[left] > heap[largest]){
            largest = left;
        }
        if(right < heapSize && heap[right] > heap[largest]){
            largest = right;
        }

        if(largest != i){
            swap(i, largest);
            heapify(largest);
        }
    }
    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void extractMaxAndStore(){
        if(heapSize == 0){
            return;
        }
        swap(0, heapSize-1);
        heapSize--;
        heapify(0);
    }

    }
    public int[] sortArray(int[] nums) {
        myHeap heaparray = new myHeap(nums);
        heaparray.buildTree();
        int size = heaparray.heapSize;
        for(int i=0; i<size; i++){
            heaparray.extractMaxAndStore();
        }
        return heaparray.heap;
        
    }
    
}