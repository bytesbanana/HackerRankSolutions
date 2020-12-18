import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long [n+1];
        int r = -1 , l = -1;
        long maxValue = Long.MIN_VALUE;
        
        for(int i = 0 ; i < queries.length;i++){
            int start = queries[i][0];
            int stop = queries[i][1];
            long value = queries[i][2];

            arr[start-1] += value;
            arr[stop] -= value;
            // ## Brute Force Way
            // for(int k = start-1;k<= end-1;k++){
            //     arr[k] = arr[k] + value;
            //     if(maxValue == -1){
            //         maxValue = arr[k];
            //     }else if(maxValue < arr[k]){
            //         maxValue = arr[k];
            //     }
            // }     
        }
        long sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            maxValue = Math.max(maxValue,sum);
        }

        return maxValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
