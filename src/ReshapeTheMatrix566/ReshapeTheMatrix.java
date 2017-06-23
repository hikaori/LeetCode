package ReshapeTheMatrix566;

import java.util.Arrays;

/**
 * Created by kaorihirata on 2017-06-19.
 *
 * In MATLAB, there is a very useful function called 'reshape',
 * which can reshape a matrix into a new one with different size but keep its original data.

 *You're given a matrix represented by a two-dimensional array,
 * and two positive integers r and c representing the row number and
 * column number of the wanted reshaped matrix, respectively.

 *The reshaped matrix need to be filled with all the elements of the original matrix
 * in the same row-traversing order as they were.

 *If the 'reshape' operation with given parameters is possible and legal,
 * output the new reshaped matrix; Otherwise, output the original matrix.
 *
 *
 *        Input:
 *        nums =[[1,2],[3,4]]
 *        r = 1, c = 4
 *        Output:
 *        [[1,2,3,4]]
 */


public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] inputNum={{1,2,3},{4,5,6}};
        int r=3;
        int c=2;

        int[][] result = new int[r][c];
        int row =0, col=0;

        for(int i=0; i<inputNum.length; i++){ // inputNum.length---> 2 (Number of '{}')
            for(int j=0; j<inputNum[0].length; j++){ //inputNum[0].length ----> 3 (Number of element)
                result[row][col] = inputNum[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        // how to show the Number (not address)
        System.out.println(Arrays.toString(result));
    }
}