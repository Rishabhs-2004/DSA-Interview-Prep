import java.util.*;
public class SubArray {
    public static void printSubarrays(int[] arr) {

         int totalSum = 0;
         for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i+1; j < arr.length; j++) {
                int end = j;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                totalSum++;

                System.out.println();
            }
              System.out.println();
        }

        System.out.println("Total Sub array sum = " +totalSum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printSubarrays(arr);
    }
}
