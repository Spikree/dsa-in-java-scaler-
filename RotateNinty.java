public class RotateNinty {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // first we take the transpose of the matrix
        for(int i = 0; i < arr.length; i ++ ) {
            for (int j = 0; j < i; j ++ ) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // swapping the row 
        for(int i = 0; i < arr.length; i ++ ) {
            int left = 0;
            int right = arr[0].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left ++;
                right --;
            }
        }

        for(int i = 0; i < arr.length ; i ++ ) {
            for (int j = 0 ; j < arr[0].length ; j ++ ) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
