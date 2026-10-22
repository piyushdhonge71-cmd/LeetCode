class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int newColor, int oldColor){
        if(r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] == newColor ||  image[r][c] != oldColor){
            return;
        }
        
        image[r][c] = newColor;
        dfs(image, r-1, c, newColor, oldColor); // top
        dfs(image, r+1, c, newColor, oldColor); // bottom
        dfs(image, r, c-1, newColor, oldColor); //left
        dfs(image, r, c+1, newColor, oldColor); // right
    }
}