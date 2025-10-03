public class wordSearch {
    public boolean exist(char[][] board, String word){
        char[] chars = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(backtracking(i, j, 0, board, chars)){
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean backtracking(int x, int y, int index, char[][] board, char[] chars){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length){
            return false;
        }
        if(board[x][y] != chars[index]){
            return false;
        }
        if(index == chars.length - 1){
            return true;
        }
        char temp = board[x][y];
        board[x][y] = '#';
        boolean found = backtracking(x, y + 1, index + 1, board, chars) |
        backtracking(x, y - 1, index + 1, board, chars) |
        backtracking(x + 1, y, index + 1, board, chars) |
        backtracking(x - 1, y, index + 1, board, chars);
        board[x][y] = temp;

        return found;
    }

}
