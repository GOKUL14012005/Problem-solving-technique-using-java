package week2;

import java.io.*;
import java.util.*;

public class minimaxsum {

    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int num : arr) {
            total += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().trim().split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(Integer.parseInt(arrTemp[i]));
        }

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
