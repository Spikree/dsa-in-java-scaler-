import java.util.*;;

public class SubArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i ++ ) {
            arr[i] = sc.nextInt();
        } 

        // main logic

        int si = 0;
        int ei = 0;

        for (si = 0; si < n; si ++) {
            for(ei = si; ei < n; ei++) {
                for(int k = si;k <= ei; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println(" ");
            }
        }


    }
}