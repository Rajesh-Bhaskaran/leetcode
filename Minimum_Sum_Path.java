class Minimum_Sum_Path {
    public int minPathSum(int[][] grid) {
         int k=0;
        for(int i=1;i<grid.length;i++){
           grid[i][k]=grid[i][k]+grid[i-1][k];
        }
        for(int j=1;j<grid[0].length;j++){
             grid[k][j]=grid[k][j]+grid[k][j-1];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                grid[i][j]=Math.min(grid[i][j]+grid[i-1][j],grid[i][j]+grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];

    }
}
