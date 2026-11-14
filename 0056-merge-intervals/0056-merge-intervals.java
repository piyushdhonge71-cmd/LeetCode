class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] result = new int [intervals.length][2];
        int k=0;
        int i=0;

        while(i < intervals.length){
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j=i+1;
            while(j < intervals.length && intervals[j][0] <= end){
                end = Math.max(intervals[j][1],end);
                j++;
            }
            result[k][0] = start;
            result[k][1] = end;
            k++;
            i = j;
        }
        return Arrays.copyOf(result, k);
    }
}