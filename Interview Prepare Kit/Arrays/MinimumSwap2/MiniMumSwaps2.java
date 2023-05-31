import java.io.*;
import java.util.*;

public class MiniMumSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int minSwapCount = 0;
        int tmp = 0;
        for(int i = 0 ; i < arr.length;i++){
            while(arr[i] != i+1){
                tmp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = tmp;
                minSwapCount++;
            }
        }

        

        // System.out.printf("\nMinswap count = %d ",minSwapCount);
        //  System.out.println();

        return minSwapCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
