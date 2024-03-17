public class Example {
    public static void main(String[] args) {
        int arr[][] = new int[5][6];
        for(int i = 0; i < arr.length; i ++ ) {
            for(int j = 0 ; j < arr[0].length; j ++ ) {
                arr[i][j] = i;
            }
        }

        for(int k = 0; k < arr.length; k ++ ) {
            for(int z = 0; z < arr[0].length; z ++ ) {
                System.out.println(arr[k][z]);
            }
        }
    }
}
