class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(search(board,i,j,word,0))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board,int r,int c,String word,int k)
    {
        if(k==word.length())
        {
            return true;
        }
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]!=word.charAt(k))
        {
            return false;
        }
        char ch=board[r][c];
        board[r][c]='-';
        boolean found=search(board,r+1,c,word,k+1)||
        search(board,r-1,c,word,k+1)||
        search(board,r,c+1,word,k+1)||
        search(board,r,c-1,word,k+1);
        board[r][c]=ch;
        return found;
    }
}