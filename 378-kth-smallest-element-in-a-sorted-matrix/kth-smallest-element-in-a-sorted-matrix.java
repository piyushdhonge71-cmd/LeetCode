class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                pq.offer(matrix[i][j]);
            }
        }
        
        for(int i=0; i<k-1; i++){
            pq.poll();
        }

        return pq.peek();
    }
}