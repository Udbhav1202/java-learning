import java.util.*;
public class twoDArray {
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+i+", "+j+")");
                    return true;
                }
            }
            
        }
        System.out.println("key not found");
        return false;
    }
    public static int getlargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element = "+largest);
        return largest;
    }
    public static void printspiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static int diagonalsum(int matrix[][]){
        
        //My brute force solution================================================================================

        /*int check = matrix.length%2;
        if(check == 1){
            int mid = (matrix.length+1)/2;
            int midterm = matrix[mid-1][mid-1];
            System.out.println(midterm);
            int sum = 0;
            for(int i=0; i<matrix[0].length; i++){
                sum = sum+matrix[i][i];
            }
            int sum1 = 0;
            int j = matrix[0].length-1;
            for(int i=0; i<matrix.length; i++){
                sum1 = sum1+matrix[i][j];
                j--;
            }
            System.out.println("Sum of dias = " +(sum+sum1-midterm));
        }
        else{
            int sum = 0;
            for(int i=0; i<matrix[0].length; i++){
                sum = sum+matrix[i][i];
            }
            int sum1 = 0;
            int j = matrix[0].length-1;
            for(int i=0; i<matrix.length; i++){
                sum1 = sum1+matrix[i][j];
                j--;
            }
            System.out.println("sum of diameters = "+ (sum + sum1));
        }*/

        // ma'am brute force solution============================================================================

        int sum =0;                                   
        /*for(int i =0; i<matrix.length; i++){                //0(n^2) 
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }*/
        
        for(int i=0; i<matrix.length; i++){            //O(n)
            //pd
            sum+= matrix[i][i];
            //sd
            if(i != matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static boolean staircasesearch(int matrix[][], int key){
        int row = 0, col=matrix[0].length-1;

        while(row<matrix.length && col >=0) {
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+", "+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static int getsmallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest element = "+smallest);
        return smallest;
    }
    public static void main(String[] args) {
        ////int matrix[][] = new int[3][3]; 
        ////int n=matrix.length , m=matrix[0].length;   // n(rows) = matrix.length karke uski length find kar liya humne aur column ki length find karne ke liye matrix[0].length kiya jisse zeroth index wali row mili aur .length se uski length pata kar li
        //Scanner sc = new Scanner(System.in);
        //for(int i=0; i<n; i++){
        //    for(int j=0; j<m; j++){
        //        matrix[i][j] = sc.nextInt();
        //    }
        //}
        //for(int i=0; i<n; i++){
        //    for(int j=0; j<m; j++){
        //        System.out.print(matrix[i][j]+" ");
        //    }
        //    System.out.println();
        //}
        //search(matrix, 4);
        //getlargest(matrix);
        //getsmallest(matrix);
        // int matrix[][] = {{1, 2, 3, 4},
        //                   {5, 6, 7, 8},
        //                   {9, 10, 11, 12},
        //                   {13, 14, 15, 16}};
        // int matrix[][] = {{10, 20, 30, 40},
        //                   {15, 25, 35, 45},
        //                   {27, 29, 37, 48},
        //                   {32, 33, 39, 50}};
        // //printspiral(matrix);
        // //System.out.println(diagonalsum(matrix));
        // staircasesearch(matrix, 33);
        int[][] matrix = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12}};
        printspiral(matrix);
    }
}