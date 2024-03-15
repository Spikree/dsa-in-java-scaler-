import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr = new int[5][6];

        //set 
        arr[1][3] = 10;

        //get 
        System.out.println(arr[1][3]);
        System.out.println(arr[2][5]);
        
        // row count 
        System.out.println(arr.length);

        // colum count
        System.out.println(arr[0].length);

        // traversal of 2d array
        for(int i = 0; i< arr.length; i++) { // row
            for (int j = 0; j < arr[0].length; j++) { // column
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}