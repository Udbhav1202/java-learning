public class BackTracking {

    public static void changeArr(int[] arr, int i, int val){
        //recursion
        if(i==arr.length){
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);  // function call step
        arr[i] = arr[i]-2;   // backtracking step
    }

    public static void findSubset(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        
        findSubset(str, ans+str.charAt(i), i+1);
        
        findSubset(str, ans, i+1);
        
        
    }

    public static void FindPermutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // to remove that char from the string below step
            String Newstr = str.substring(0, i) + str.substring(i+1); // if we do not give end index then it automatically assumes n-1 end index
            FindPermutation(Newstr, ans+curr);
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static boolean isSafe(char[][] board, int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1, j =col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row){
        if(row==board.length){
            // printBoard(board);
            
            // System.out.println();
            count++;
            return;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j] = 'x';
            }
            
        }

    }

    public static void printBoard(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j =0; j<board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void GridWays(int m, int n, char[][] grid, int i, int j){
        if(m==1 && n==1 && i==grid.length && j==grid[0].length){
            printBoard(grid);
            return;
        }
        GridWays(m-1, n, grid, i+1, j);
        
    }

    static int count = 0;

    public static void main(String[] args) {
        // int n=5;
        // char board[][] = new char[n][n];
        // // initialize 
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         board[i][j]='x';
        //     }
        // }
        
        // nQueens(board, 0);
        // System.out.println(count);

        int m = 5;
        int n = 4;
        char[][] grid = new char[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j]='x';
            }
        }
        GridWays(m, n, grid, 0, 0);
        System.out.println();

    }
}