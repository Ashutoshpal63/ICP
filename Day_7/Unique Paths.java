class Solution {
    public int uniquePaths(int m, int n) {
        int [][]grid=new int[m][n];
        return helper(grid,0,0,m,n);
    }
    public int helper(int[][]grid,int i,int j,int m,int n)
    {
        if(i==m-1 && j==n-1) return 1;
        if(i>=m || j>=n) return 0;
        if(grid[i][j]!=0) return grid[i][j];
        grid[i][j]=helper(grid,i+1,j,m,n)+helper(grid,i,j+1,m,n);
        return grid[i][j];
    }
}