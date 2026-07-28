class Solution {
    public boolean isValidSudoku(char[][] board) {
        
    for(int i=0;i<9;i++)
    {
        Set<Character> st=new HashSet<>();
        for(int j=0;j<9;j++)
        {
            if(board[i][j]=='.') continue;

             if(st.contains(board[i][j]))
             {
                 return false;
             }
              

             st.add(board[i][j]);
        }
    }
        for(int i=0;i<9;i++)
    {
        Set<Character> st=new HashSet<>();
        for(int j=0;j<9;j++)
        {    
             if(board[j][i]=='.') continue;
             if(st.contains(board[j][i]))
             {
                 return false;
             }
             

             st.add(board[j][i]);
        }
    }

    for(int i=0;i<9 ;i++)
    {
         Set<Character> st= new HashSet<>();
         for(int j=0;j<3;j++)
         {
            for(int k=0;k<3;k++)
            {
                int r=(i/3)*3+j;
                int c=(i%3)*3+k;
                 if(board[r][c]=='.') continue;
                if(st.contains(board[r][c])) return false;

                

                st.add(board[r][c]);
            }
         }
    }

    return true;

    }
}
